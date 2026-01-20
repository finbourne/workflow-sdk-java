# com.finbourne.workflow.model.RelativeMonthRegularity
Relative Month Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **Integer** | The frequency of the Relative Month Regularity. For example, a value of 2 indicates every 2 months | [default to Integer]
**daysOfWeek** | **List&lt;String&gt;** | Days of the week. One or more of - Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday | [default to List<String>]
**index** | **String** | Relative index in the month. One of - First, Second, Third, Fourth, Last. For example, to specify the second Tuesday of every month, set DaysOfWeek to [\&quot;Tuesday\&quot;] and Index to \&quot;Second\&quot; | [default to String]
**type** | **String** | The type of Date Regularity | [default to String]

```java
import com.finbourne.workflow.model.RelativeMonthRegularity;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Frequency = new Integer("100.00");
List<String> DaysOfWeek = new List<String>();
String Index = "example Index";
String Type = "example Type";


RelativeMonthRegularity relativeMonthRegularityInstance = new RelativeMonthRegularity()
    .Frequency(Frequency)
    .DaysOfWeek(DaysOfWeek)
    .Index(Index)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
