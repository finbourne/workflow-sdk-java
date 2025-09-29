# com.finbourne.workflow.model.ScheduleMatchingPattern
The Schedule Matching Pattern to trigger on

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | [**ScheduleMatchingPatternContext**](ScheduleMatchingPatternContext.md) |  | [default to ScheduleMatchingPatternContext]
**recurrencePattern** | [**RecurrencePattern**](RecurrencePattern.md) |  | [default to RecurrencePattern]

```java
import com.finbourne.workflow.model.ScheduleMatchingPattern;
import java.util.*;
import java.lang.System;
import java.net.URI;

ScheduleMatchingPatternContext Context = new ScheduleMatchingPatternContext();
RecurrencePattern RecurrencePattern = new RecurrencePattern();


ScheduleMatchingPattern scheduleMatchingPatternInstance = new ScheduleMatchingPattern()
    .Context(Context)
    .RecurrencePattern(RecurrencePattern);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
