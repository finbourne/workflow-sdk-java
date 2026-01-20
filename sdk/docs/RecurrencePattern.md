# com.finbourne.workflow.model.RecurrencePattern
The Recurrence Pattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeConstraints** | [**TimeConstraints**](TimeConstraints.md) |  | [default to TimeConstraints]
**dateRegularity** | [**DateRegularity**](DateRegularity.md) |  | [default to DateRegularity]
**businessDayAdjustment** | **String** | The Business Day Adjustment. One of None, Previous, Following, ModifiedPrevious, ModifiedFollowing, HalfMonthModifiedFollowing, Nearest | [default to String]

```java
import com.finbourne.workflow.model.RecurrencePattern;
import java.util.*;
import java.lang.System;
import java.net.URI;

TimeConstraints TimeConstraints = new TimeConstraints();
DateRegularity DateRegularity = new DateRegularity();
String BusinessDayAdjustment = "example BusinessDayAdjustment";


RecurrencePattern recurrencePatternInstance = new RecurrencePattern()
    .TimeConstraints(TimeConstraints)
    .DateRegularity(DateRegularity)
    .BusinessDayAdjustment(BusinessDayAdjustment);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
