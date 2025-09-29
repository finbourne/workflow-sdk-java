# com.finbourne.workflow.model.ActionLogItem
A log item for a given Action Log

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of the log item | [default to OffsetDateTime]
**logType** | **String** | The type of log item | [default to String]
**details** | **String** | The details of the log item | [optional] [default to String]

```java
import com.finbourne.workflow.model.ActionLogItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Timestamp = OffsetDateTime.now();
String LogType = "example LogType";
@jakarta.annotation.Nullable String Details = "example Details";


ActionLogItem actionLogItemInstance = new ActionLogItem()
    .Timestamp(Timestamp)
    .LogType(LogType)
    .Details(Details);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
