# com.finbourne.workflow.model.TimeConstraints
Time constraints for a Recurrence Pattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | Start date of the Recurrence Pattern | [default to String]
**endDate** | **String** | Optional end date of the Recurrence Pattern | [optional] [default to String]
**timesOfDay** | [**List&lt;TimeOfDay&gt;**](TimeOfDay.md) | Times of the day to run the Recurrence Pattern | [default to List<TimeOfDay>]

```java
import com.finbourne.workflow.model.TimeConstraints;
import java.util.*;
import java.lang.System;
import java.net.URI;

String StartDate = "example StartDate";
@jakarta.annotation.Nullable String EndDate = "example EndDate";
List<TimeOfDay> TimesOfDay = new List<TimeOfDay>();


TimeConstraints timeConstraintsInstance = new TimeConstraints()
    .StartDate(StartDate)
    .EndDate(EndDate)
    .TimesOfDay(TimesOfDay);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
