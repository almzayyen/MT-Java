cp kaiser/src/main/resources/uva_export_application.properties kaiser/src/main/resources/application.properties
./gradlew kaiser:war
cp kaiser/build/libs/kaiser-0.0.1.war kaiser.war

cp kaiser/src/main/resources/uva_import_application.properties kaiser/src/main/resources/application.properties
./gradlew kaiser:war
cp kaiser/build/libs/kaiser-0.0.1.war kaiser_import.war

cp kaiser/src/main/resources/application.properties.example kaiser/src/main/resources/application.properties