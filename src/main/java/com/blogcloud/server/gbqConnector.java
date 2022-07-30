package com.blogcloud.server;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.bigquery.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class gbqConnector {


    public static void main(String[] args) throws IOException {
//        BigQuery bigquery = BigQueryOptions.getDefaultInstance().getService();
        BigQuery bigquery = BigQueryOptions.newBuilder().setProjectId("totemic-formula-357802")
                .setCredentials(
                        ServiceAccountCredentials.fromStream(new FileInputStream("C:\\Users\\Yanwe\\.config\\gcloud\\gcloud_server_account.json"))
                ).build().getService();

        TableId tableId = TableId.of("lele", "t_friend");
        Table table = bigquery.getTable(tableId);
        if (table == null) {
            System.out.println("Creating table " + tableId);
            Map<String, LegacySQLTypeName> fieldMap = new HashMap<String, LegacySQLTypeName>()
            {{
                put("id", LegacySQLTypeName.INTEGER);
                put("blog_address", LegacySQLTypeName.STRING);
                put("create_time", LegacySQLTypeName.DATETIME);
                put("picture_address", LegacySQLTypeName.STRING);
            }};
            Schema schema = new gbqConnector().buildSchema(fieldMap);
            table = bigquery.create(TableInfo.of(tableId, StandardTableDefinition.of(schema)));
        }

    }
    // test 11
    public Schema buildSchema(Map<String, LegacySQLTypeName> fieldMap){
        List<Field> fieldList = new ArrayList<>();
        fieldMap.forEach((key, value) -> fieldList.add(Field.of(key, value)));
        return Schema.of(fieldList);
    }


}
