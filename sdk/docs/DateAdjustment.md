# com.finbourne.workflow.model.DateAdjustment
A date adjustment to apply to the scheduled time of an EventHandler with a Finbourne.Workflow.WebApi.Common.Dto.Json.EventHandlers.ScheduleMatchingPattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deltaDays** | **Integer** | The delta to apply to the date part of the scheduled time, in days | [default to Integer]
**businessDayAdjustment** | **String** | The Business Day Adjustment | [default to String]

```java
import com.finbourne.workflow.model.DateAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer DeltaDays = new Integer("100.00");
String BusinessDayAdjustment = "example BusinessDayAdjustment";


DateAdjustment dateAdjustmentInstance = new DateAdjustment()
    .DeltaDays(DeltaDays)
    .BusinessDayAdjustment(BusinessDayAdjustment);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
