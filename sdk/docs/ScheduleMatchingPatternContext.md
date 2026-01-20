# com.finbourne.workflow.model.ScheduleMatchingPatternContext
Context for a Schedule Matching Pattern

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeZone** | **String** | The time zone to use. A TZ Identifier e.g. \&quot;Europe/London\&quot; | [default to String]
**holidayCalendars** | [**List&lt;CalendarReference&gt;**](CalendarReference.md) | References to any Holiday Calendars to use | [optional] [default to List<CalendarReference>]

```java
import com.finbourne.workflow.model.ScheduleMatchingPatternContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TimeZone = "example TimeZone";
@jakarta.annotation.Nullable List<CalendarReference> HolidayCalendars = new List<CalendarReference>();


ScheduleMatchingPatternContext scheduleMatchingPatternContextInstance = new ScheduleMatchingPatternContext()
    .TimeZone(TimeZone)
    .HolidayCalendars(HolidayCalendars);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
