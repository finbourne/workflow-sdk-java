# com.finbourne.workflow.model.EventTaskFieldMapping
How an Event Launcher fills one field of the root task from the event that arrived

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapFrom** | **String** | The path into the event the value is taken from, for example header.timestamp | [default to String]
**dateTimeAdjustment** | [**DateTimeAdjustment**](DateTimeAdjustment.md) |  | [optional] [default to DateTimeAdjustment]

```java
import com.finbourne.workflow.model.EventTaskFieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MapFrom = "example MapFrom";
DateTimeAdjustment DateTimeAdjustment = new DateTimeAdjustment();


EventTaskFieldMapping eventTaskFieldMappingInstance = new EventTaskFieldMapping()
    .MapFrom(MapFrom)
    .DateTimeAdjustment(DateTimeAdjustment);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
