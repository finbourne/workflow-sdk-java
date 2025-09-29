# com.finbourne.workflow.model.DateRegularity
A Date Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of Date Regularity | [default to String]
**frequency** | **Integer** | The frequency of the Week Regularity | [default to Integer]
**daysOfWeek** | **List&lt;String&gt;** | Days of the week | [default to List<String>]
**index** | **String** | Relative index in the month | [default to String]
**daysOfMonth** | **List&lt;Integer&gt;** | Days of the month | [default to List<Integer>]
**dates** | [**List&lt;DayOfYear&gt;**](DayOfYear.md) | The dates in the year | [default to List<DayOfYear>]

```java
import com.finbourne.workflow.model.DateRegularity;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with DayRegularity DateRegularity
DayRegularity dateRegularity = new DayRegularity();
dateRegularity.setType(DayRegularity.TypeEnum.DAYREGULARITY);
DateRegularity config = new DateRegularity(dateRegularity);

```
 See all compatible oneOf types with DateRegularity
* [DayRegularity](./DayRegularity.md)

* [RelativeMonthRegularity](./RelativeMonthRegularity.md)

* [SpecificMonthRegularity](./SpecificMonthRegularity.md)

* [WeekRegularity](./WeekRegularity.md)

* [YearRegularity](./YearRegularity.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
