# com.finbourne.workflow.model.DateRegularity
A Date Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of Date Regularity | [default to String]
**frequency** | **Integer** | The frequency of the Week Regularity. For example, a value of 2 indicates every 2 weeks | [default to Integer]
**daysOfWeek** | **List&lt;String&gt;** | Days of the week. One or more of - Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday | [default to List<String>]
**index** | **String** | Relative index in the month. One of - First, Second, Third, Fourth, Last. For example, to specify the second Tuesday of every month, set DaysOfWeek to [\&quot;Tuesday\&quot;] and Index to \&quot;Second\&quot; | [default to String]
**daysOfMonth** | **List&lt;Integer&gt;** | Days of the month. For example, to specify the 1st and 15th of every month, set DaysOfMonth to [1, 15] | [default to List<Integer>]
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
