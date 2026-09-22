# com.finbourne.workflow.model.CalendarContext
A named time zone and set of holiday calendars.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name the schedule and the date and time adjustments use to name this context | [default to String]
**timeZone** | **String** | The time zone to use. A TZ identifier, for example \&quot;Europe/London\&quot; | [default to String]
**holidayCalendars** | [**List&lt;CalendarReference&gt;**](CalendarReference.md) | The holiday calendars that decide which dates are business days in this context | [optional] [default to List<CalendarReference>]

```java
import com.finbourne.workflow.model.CalendarContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String TimeZone = "example TimeZone";
@jakarta.annotation.Nullable List<CalendarReference> HolidayCalendars = new List<CalendarReference>();


CalendarContext calendarContextInstance = new CalendarContext()
    .Name(Name)
    .TimeZone(TimeZone)
    .HolidayCalendars(HolidayCalendars);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
