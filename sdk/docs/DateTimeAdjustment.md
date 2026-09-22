# com.finbourne.workflow.model.DateTimeAdjustment
A change applied to the date and the time of a source value, in a named calendar context.   At least one of Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.DateTimeAdjustment.DateAdjustment or Finbourne.Workflow.WebApi.Common.Dto.Json.Launchers.DateTimeAdjustment.TimeAdjustment must be given

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calendarContext** | **String** | The name of the calendar context this change happens in, which must be one the Launcher declares. When it is left out a Schedule Launcher uses the context of its schedule | [optional] [default to String]
**dateAdjustment** | [**DateAdjustment**](DateAdjustment.md) |  | [optional] [default to DateAdjustment]
**timeAdjustment** | [**TimeAdjustment**](TimeAdjustment.md) |  | [optional] [default to TimeAdjustment]

```java
import com.finbourne.workflow.model.DateTimeAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String CalendarContext = "example CalendarContext";
DateAdjustment DateAdjustment = new DateAdjustment();
TimeAdjustment TimeAdjustment = new TimeAdjustment();


DateTimeAdjustment dateTimeAdjustmentInstance = new DateTimeAdjustment()
    .CalendarContext(CalendarContext)
    .DateAdjustment(DateAdjustment)
    .TimeAdjustment(TimeAdjustment);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
