# com.finbourne.workflow.model.LauncherSchedule
When a Schedule Launcher starts a run of its Workflow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarContext** | **String** | The name of the calendar context the schedule is read in, which must be one the Launcher declares | [default to String]
**recurrencePattern** | [**RecurrencePattern**](RecurrencePattern.md) |  | [default to RecurrencePattern]

```java
import com.finbourne.workflow.model.LauncherSchedule;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CalendarContext = "example CalendarContext";
RecurrencePattern RecurrencePattern = new RecurrencePattern();


LauncherSchedule launcherScheduleInstance = new LauncherSchedule()
    .CalendarContext(CalendarContext)
    .RecurrencePattern(RecurrencePattern);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
