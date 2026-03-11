package com.gzbz.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.gzbz.scan.GameServerScan;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.PostConstruct;

import model.ModelAnno;
import model.ModelColumnNode;
import model.ModelPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import scan.ScanAnnotation;

@Component
public class GameModelPool extends ModelPool {
    @Value("${xlsPath}")
    private String filePath;
    @Value("${language}")
    private String language;
    @Value("${exlanguage}")
    private String exlanguage;
    @Value("${produceXls}")
    private String produceXls;
    @Value("${opPath}")
    private String systemOperationPath;
    @Autowired
    private GameServerScan gameServerScan;
    @Autowired
    private Environment env;
    private ConcurrentHashMap<String, ConcurrentHashMap<String, ConcurrentHashMap<String, FieldCheckItem>>> checkCache = new ConcurrentHashMap();

    public String getFilePath() {
        return this.filePath;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getExlanguage() {
        return this.exlanguage;
    }

    public String getProducePath() {
        return this.produceXls;
    }

    public ScanAnnotation getScanAnnotation() {
        return this.gameServerScan;
    }

    @PostConstruct
    public void start() throws Exception {
        super.start();
    }

    public String getSystemOperationPath() {
        return this.systemOperationPath;
    }

    private Field getField(Class<?> cls, String fieldName) {
        Field field = null;

        while (cls != null) {
            try {
                field = cls.getDeclaredField(fieldName);
            } catch (Exception var5) {
                cls = cls.getSuperclass();
            }
        }

        return field;
    }

    private boolean compare(Object xlsValue, Object csvValue) throws Exception {
        if (xlsValue.getClass() != csvValue.getClass()) {
            return false;
        } else {
            switch (xlsValue.getClass().getSimpleName()) {
                case "int":
                case "Integer":
                    return (Integer) xlsValue == (Integer) csvValue;
                case "byte":
                case "Byte":
                    return (Byte) xlsValue == (Byte) csvValue;
                case "short":
                case "Short":
                    return (Short) xlsValue == (Short) csvValue;
                case "long":
                case "Long":
                    return (Long) xlsValue == (Long) csvValue;
                case "float":
                case "Float":
                    float diffF = (Float) xlsValue - (Float) csvValue;
                    return diffF < 1.0E-5F && diffF > -1.0E-5F;
                case "double":
                case "Double":
                    double diffD = (Double) xlsValue - (Double) csvValue;
                    return diffD < (double) 1.0E-5F && diffD > (double) -1.0E-5F;
                case "String":
                    return xlsValue.equals(csvValue);
                default:
                    Field[] fields = xlsValue.getClass().getDeclaredFields();

                    for (Field xlsField : fields) {
                        Field csvField = csvValue.getClass().getDeclaredField(xlsField.getName());
                        csvField.setAccessible(true);
                        xlsField.setAccessible(true);
                        Object fieldXlsObj = xlsField.get(xlsValue);
                        Object fieldCsvObj = csvField.get(csvValue);
                        if (fieldXlsObj != null || fieldCsvObj != null) {
                            if (fieldXlsObj == null && fieldCsvObj != null || fieldXlsObj != null && fieldCsvObj == null) {
                                return false;
                            }

                            if (Map.class.isAssignableFrom(xlsField.getType())) {
                                Map<?, ?> xlsMap = (Map) fieldXlsObj;
                                Map<?, ?> csvMap = (Map) fieldCsvObj;
                                if (xlsMap.size() != csvMap.size()) {
                                    return false;
                                }

                                for (Map.Entry<?, ?> xlsMapEntry : xlsMap.entrySet()) {
                                    Object xlsMapKey = xlsMapEntry.getKey();
                                    if (!csvMap.containsKey(xlsMapKey)) {
                                        return false;
                                    }

                                    Object xlsMapValue = xlsMapEntry.getValue();
                                    Object csvMapValue = csvMap.get(xlsMapKey);
                                    if (!this.compare(xlsMapValue, csvMapValue)) {
                                        logger.info("数据不同：" + fieldXlsObj + "---" + fieldCsvObj);
                                        return false;
                                    }
                                }
                            } else if (List.class.isAssignableFrom(xlsField.getType())) {
                                List xlsList = (List) fieldXlsObj;
                                List csvList = (List) fieldCsvObj;
                                if (xlsList.size() != csvList.size()) {
                                    return false;
                                }

                                for (int i = 0; i < xlsList.size(); ++i) {
                                    Object xlsListValue = xlsList.get(i);
                                    Object csvListValue = csvList.get(i);
                                    if (!this.compare(xlsListValue, csvListValue)) {
                                        logger.info("数据不同：" + fieldXlsObj + "---" + fieldCsvObj);
                                        return false;
                                    }
                                }
                            } else if (fieldXlsObj != null || fieldCsvObj != null) {
                                if (fieldXlsObj == null && fieldCsvObj != null || fieldXlsObj != null && fieldCsvObj == null) {
                                    return false;
                                }

                                if (!this.compare(fieldXlsObj, fieldCsvObj)) {
                                    logger.info("数据不同：" + fieldXlsObj + "---" + fieldCsvObj);
                                    return false;
                                }
                            }
                        }
                    }

                    return true;
            }
        }
    }

    public void compareXlsCsv() {
        String xlsPath = "C:\\Users\\User\\Desktop\\quanlyvattuhai12c1\\gamesever\\cfg\\xls";
        String csvPath = "C:\\Users\\User\\Desktop\\quanlyvattuhai12c1\\gamesever\\cfg\\xls";
//      String csvPath = "F:/test/csv";
        ConcurrentHashMap<String, ConcurrentHashMap<?, ?>> csv_pool = new ConcurrentHashMap();
        ConcurrentHashMap<String, ConcurrentHashMap<?, ?>> xls_pool = new ConcurrentHashMap();
        boolean loadFlag = true;

        try {
            File xlsRoot = new File(xlsPath);

            for (File xlsFile : xlsRoot.listFiles()) {
                this.loadXls(xls_pool, xlsFile);
            }

            File csvRoot = new File(csvPath);

            for (File xlsFile : csvRoot.listFiles()) {
                this.loadCsv(csv_pool, xlsFile);
            }
            logger.info("done");
        } catch (Exception var18) {
            loadFlag = false;
            logger.error("加载excel或者csv错误!!!");
        }

        boolean flag = true;

        for (String name : xls_pool.keySet()) {
            ConcurrentHashMap<?, ?> xls_map = xls_pool.get(name);
            ConcurrentHashMap<?, ?> csv_map = csv_pool.get(name);
            if (xls_map.size() != csv_map.size()) {
                logger.error("表{}数据个数对不上，xls{},csv{}", new Object[]{name, xls_map.size(), csv_map.size()});
            } else {
                for (Map.Entry<?, ?> entry : xls_map.entrySet()) {
                    Object xlsKey = entry.getKey();
                    Object xlsValue = entry.getValue();
                    Object csvValue = csv_map.get(xlsKey);
                    if (csvValue == null) {
                        logger.error("表:{},csv中未加载到数据{}", name, xlsKey);
                    } else {
                        try {
                            boolean result = this.compare(xlsValue, csvValue);
                            if (!result) {
                                logger.error("表{},key:{},数据不同", name, xlsKey);
                                flag = false;
                                break;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            logger.error("excel与csv对比出错:{}", name);
                        }
                    }
                }
            }
        }

        if (!loadFlag) {
            logger.error("加载excel或者csv错误!!!");
        }

        if (flag) {
            logger.info("所有表对比结束，未发现不同！！！");
        } else {
            logger.error("所有表对比结束，有表对比错误！！！");
        }

    }

    public void loadCsvAndExportJson() {

        String csvPath = "C:\\Users\\User\\Desktop\\quanlyvattuhai12c1\\gamesever\\cfg\\xls";
        String outputDirPath = "./loaded_data";

        ConcurrentHashMap<String, ConcurrentHashMap<?, ?>> csv_pool = new ConcurrentHashMap<>();
        boolean loadFlag = true;

        try {
            File csvRoot = new File(csvPath);
            for (File csvFile : csvRoot.listFiles()) {
                this.loadCsv(csv_pool, csvFile);
            }
            logger.info("CSV load done");
        } catch (Exception e) {
            loadFlag = false;
            logger.error("加载csv错误!!!", e);
        }

        if (!loadFlag) {
            return;
        }

        try {
            File outputDir = new File(outputDirPath);
            if (!outputDir.exists()) {
                outputDir.mkdirs();
            }

            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);

            // ================= EXPORT CSV TABLE =================
            for (Map.Entry<String, ConcurrentHashMap<?, ?>> tableEntry : csv_pool.entrySet()) {

                String tableName = tableEntry.getKey();
                ConcurrentHashMap<?, ?> tableData = tableEntry.getValue();

                List<Map<String, Object>> safeList = new ArrayList<>();
                for (Object obj : tableData.values()) {
                    safeList.add((Map<String, Object>) convertObjectSafe(obj));
                }

                File outFile = new File(outputDir, tableName + ".json");
                mapper.writeValue(outFile, safeList);

                logger.info("Exported table {} to {}", tableName, outFile.getAbsolutePath());
            }

            // ================= EXPORT modelNodeMap =================
            File nodeMapDir = new File("./node_map");
            if (!nodeMapDir.exists()) {
                nodeMapDir.mkdirs();
            }

            File nodeMapFile = new File(nodeMapDir, "modelNodeMap.json");

            Map<String, Object> safeNodeMap = new LinkedHashMap<>();

            for (Map.Entry<?, ?> entry : super.modelNodeMap.entrySet()) {
                String key = String.valueOf(entry.getKey());
                Object value = entry.getValue();

                safeNodeMap.put(key, convertObjectSafe(value));
            }

            mapper.writeValue(nodeMapFile, safeNodeMap);

            logger.info("Exported modelNodeMap to {}", nodeMapFile.getAbsolutePath());
            logger.info("All tables exported successfully!");

        } catch (Exception e) {
            logger.error("写入JSON文件错误!!!", e);
        }
    }

    private Object convertObjectSafe(Object obj) throws IllegalAccessException {
        return convertObjectSafe(obj, new IdentityHashMap<>());
    }

    private Object convertObjectSafe(Object obj, Map<Object, Boolean> visited)
            throws IllegalAccessException {

        if (obj == null) {
            return "";
        }

        // Nếu đã duyệt object này rồi -> tránh vòng lặp
        if (visited.containsKey(obj)) {
            return "CIRCULAR_REFERENCE";
        }

        // primitive / wrapper / String
        if (obj instanceof String ||
                obj instanceof Number ||
                obj instanceof Boolean ||
                obj.getClass().isEnum()) {
            return obj;
        }

        visited.put(obj, true);

        // List
        if (obj instanceof List) {
            List<?> list = (List<?>) obj;
            List<Object> safeList = new ArrayList<>();
            for (Object item : list) {
                safeList.add(convertObjectSafe(item, visited));
            }
            return safeList;
        }

        // Map
        if (obj instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) obj;
            Map<String, Object> safeMap = new LinkedHashMap<>();
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                safeMap.put(
                        String.valueOf(entry.getKey()),
                        convertObjectSafe(entry.getValue(), visited)
                );
            }
            return safeMap;
        }

        // Object thường
        Map<String, Object> result = new LinkedHashMap<>();
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {

            // bỏ static
            if (Modifier.isStatic(field.getModifiers())) {
                continue;
            }

            field.setAccessible(true);
            Object value = field.get(obj);

            result.put(field.getName(), convertObjectSafe(value, visited));
        }

        return result;
    }

    private void addCheckItem(String fileName, String fieldName, String fieldValue, byte checkPolicy, String checkPolicyParam) {
        if (fileName != null && !fileName.isEmpty()) {
            if (fieldName != null && !fieldName.isEmpty()) {
                if (checkPolicy > 0) {
                    ((ConcurrentHashMap) ((ConcurrentHashMap) this.checkCache.computeIfAbsent(fileName, (k) -> new ConcurrentHashMap())).computeIfAbsent(fieldName, (k) -> new ConcurrentHashMap())).computeIfAbsent(fieldValue, (k) -> new FieldCheckItem(fieldValue, checkPolicy, checkPolicyParam));
                }
            }
        }
    }

    protected void checkField(Object model, ModelColumnNode columnNode, String strValue, String line) throws Exception {
        super.checkField(model, columnNode, strValue, line);
        if (columnNode.filedCheckFuc != null && !columnNode.filedCheckFuc.isEmpty()) {
            Method method = model.getClass().getDeclaredMethod(columnNode.filedCheckFuc, String.class);
            String failedReason = (String) method.invoke(model, strValue);
            if (failedReason != null && !failedReason.isEmpty()) {
                throw new Exception(String.format("GameModelPool.checkField 检查字段失败, 字段名: %s 失败原因: %s line: %s", columnNode.columnName, failedReason, line));
            }
        }

        String failedReason = "";
        String checkPolicyParam = columnNode.fieldCheckPolicyParam;
        switch (columnNode.fieldCheckPolicy) {
            case 0:
            default:
                break;
            case 1:
                if (strValue == null || strValue.isEmpty()) {
                    failedReason = "字段不能为空";
                }
                break;
            case 2:
                this.addCheckItem(((ModelAnno) model.getClass().getAnnotation(ModelAnno.class)).file(), columnNode.columnName, strValue, columnNode.fieldCheckPolicy, columnNode.fieldCheckPolicyParam);
        }

        if (!failedReason.isEmpty()) {
            throw new Exception(String.format("GameModelPool.checkField 检查字段失败, 字段名: %s 失败原因: %s line: %s", columnNode.columnName, failedReason, line));
        }
    }

    protected void onLoadPoolFinish() throws Exception {
        Map<Integer, HeroModel> heroModelMap = this.getMap("hero");

        for (Map.Entry<String, ConcurrentHashMap<String, ConcurrentHashMap<String, FieldCheckItem>>> entry : this.checkCache.entrySet()) {
            String fileName = (String) entry.getKey();
            ConcurrentHashMap<String, ConcurrentHashMap<String, FieldCheckItem>> checkFieldItems = (ConcurrentHashMap) entry.getValue();

            for (Map.Entry<String, ConcurrentHashMap<String, FieldCheckItem>> checkEntry : checkFieldItems.entrySet()) {
                String fieldName = (String) checkEntry.getKey();
                ConcurrentHashMap<String, FieldCheckItem> fieldCheckItem = (ConcurrentHashMap) checkEntry.getValue();

                for (Map.Entry<String, FieldCheckItem> checkItems : fieldCheckItem.entrySet()) {
                    String failedReason = "";
                    String checkPolicyParam = ((FieldCheckItem) checkItems.getValue()).checkPolicyParam;
                    switch (((FieldCheckItem) checkItems.getValue()).checkPolicy) {
                        case 2:
                            if (heroModelMap.get(Integer.parseInt(((FieldCheckItem) checkItems.getValue()).fieldValue)) == null) {
                                failedReason = "武将ID错误";
                            }
                        default:
                            if (!failedReason.isEmpty()) {
                                this.checkCache.clear();
                                throw new Exception(String.format("GameModelPool.onLoadCsvFinish 检查字段失败, 配置表名: %s 字段名: %s 失败原因: %s 字段值: %s", fileName, fieldName, failedReason, ((FieldCheckItem) checkItems.getValue()).fieldValue));
                            }
                    }
                }
            }
            logger.info("Done load csv");

        }

        this.checkCache.clear();
    }

    static class FieldCheckItem {
        String fieldValue;
        byte checkPolicy;
        String checkPolicyParam;

        FieldCheckItem(String filedValue_, byte checkPolicy_, String checkPolicyParam_) {
            this.fieldValue = filedValue_;
            this.checkPolicy = checkPolicy_;
            this.checkPolicyParam = checkPolicyParam_;
        }
    }
}
