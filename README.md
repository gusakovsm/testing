### Test execution
In this project tests could be executed two ways:
* `mvn clean test` - tests will be executed on Chrome browser by default.
* `mvn clean test -DargLine="-Dbrowser=browserName"` - with parametrized browser. Examples:
    * `mvn clean test -DargLine="-Dbrowser=chrome"`
    * `mvn clean test -DargLine="-Dbrowser=firefox"`
    * `mvn clean test -DargLine="-Dbrowser=edge"`
    * `mvn clean test -DargLine="-Dbrowser=opera"`
