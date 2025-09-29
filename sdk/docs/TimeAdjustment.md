# com.finbourne.workflow.model.TimeAdjustment
A time adjustment to apply to the scheduled time of an EventHandler with a Finbourne.Workflow.WebApi.Common.Dto.Json.EventHandlers.ScheduleMatchingPattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**setTo** | [**SpecifiedTime**](SpecifiedTime.md) |  | [default to SpecifiedTime]

```java
import com.finbourne.workflow.model.TimeAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

SpecifiedTime SetTo = new SpecifiedTime();


TimeAdjustment timeAdjustmentInstance = new TimeAdjustment()
    .SetTo(SetTo);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
