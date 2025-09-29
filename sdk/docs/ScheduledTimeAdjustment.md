# com.finbourne.workflow.model.ScheduledTimeAdjustment
Represents an adjustment to the scheduled time of an EventHandler. Only relevant for EventHandlers with a Finbourne.Workflow.WebApi.Common.Dto.Json.EventHandlers.ScheduleMatchingPattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateAdjustment** | [**DateAdjustment**](DateAdjustment.md) |  | [default to DateAdjustment]
**timeAdjustment** | [**TimeAdjustment**](TimeAdjustment.md) |  | [default to TimeAdjustment]

```java
import com.finbourne.workflow.model.ScheduledTimeAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateAdjustment DateAdjustment = new DateAdjustment();
TimeAdjustment TimeAdjustment = new TimeAdjustment();


ScheduledTimeAdjustment scheduledTimeAdjustmentInstance = new ScheduledTimeAdjustment()
    .DateAdjustment(DateAdjustment)
    .TimeAdjustment(TimeAdjustment);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
