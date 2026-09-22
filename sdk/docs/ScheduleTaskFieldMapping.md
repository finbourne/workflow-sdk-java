# com.finbourne.workflow.model.ScheduleTaskFieldMapping
How a Schedule Launcher fills one field of the root task from the instant the schedule fired

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapFrom** | **String** | The value the field is taken from. One of - ScheduledTime | [default to String]
**dateTimeAdjustment** | [**DateTimeAdjustment**](DateTimeAdjustment.md) |  | [optional] [default to DateTimeAdjustment]

```java
import com.finbourne.workflow.model.ScheduleTaskFieldMapping;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MapFrom = "example MapFrom";
DateTimeAdjustment DateTimeAdjustment = new DateTimeAdjustment();


ScheduleTaskFieldMapping scheduleTaskFieldMappingInstance = new ScheduleTaskFieldMapping()
    .MapFrom(MapFrom)
    .DateTimeAdjustment(DateTimeAdjustment);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
