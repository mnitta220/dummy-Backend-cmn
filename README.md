# dummy-Backend-cmn

```
mvn clean install
```

.vscode/launch.json

```
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "CrmApplication",
            "request": "launch",
            "mainClass": "jp.go.urnet.dummy.crm.CrmApplication"
        },
        {
            "type": "java",
            "name": "Debug dummy-Backend-crm",
            "request": "launch",
            "mainClass": "jp.go.urnet.dummy.crm.CrmApplication",
            "projectName": "dummy-Backend-crm",
            "cwd": "${workspaceFolder}/dummy-Backend-crm",
            "args": "",
            "vmArgs": "-Dspring.profiles.active=dev",
            "env": {
                "SPRING_PROFILES_ACTIVE": "dev"
            },
            "console": "integratedTerminal",
            "internalConsoleOptions": "neverOpen"
        },
        {
            "type": "java",
            "name": "Debug dummy-Backend-myp",
            "request": "launch",
            "mainClass": "jp.go.urnet.dummy.myp.MypApplication",
            "projectName": "dummy-Backend-myp",
            "cwd": "${workspaceFolder}/dummy-Backend-myp",
            "args": "",
            "vmArgs": "-Dspring.profiles.active=dev",
            "env": {
                "SPRING_PROFILES_ACTIVE": "dev"
            },
            "console": "integratedTerminal",
            "internalConsoleOptions": "neverOpen"
        },
        {
            "type": "java",
            "name": "Debug dummy-Backend-cmn",
            "request": "launch",
            "mainClass": "jp.go.urnet.dummy.common.DateUtil",
            "projectName": "dummy-Backend-cmn",
            "cwd": "${workspaceFolder}/dummy-Backend-cmn",
            "args": "",
            "vmArgs": "",
            "console": "integratedTerminal",
            "internalConsoleOptions": "neverOpen"
        }
    ]
}
```
