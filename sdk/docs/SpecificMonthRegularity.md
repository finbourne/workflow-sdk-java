# com.finbourne.workflow.model.SpecificMonthRegularity
Specific Month Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **Integer** | The frequency of the Specific Month Regularity. For example, a value of 2 indicates every 2 months | [default to Integer]
**daysOfMonth** | **List&lt;Integer&gt;** | Days of the month. For example, to specify the 1st and 15th of every month, set DaysOfMonth to [1, 15] | [default to List<Integer>]
**type** | **String** | The type of Date Regularity | [default to String]

```java
import com.finbourne.workflow.model.SpecificMonthRegularity;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Frequency = new Integer("100.00");
List<Integer> DaysOfMonth = new List<Integer>();
String Type = "example Type";


SpecificMonthRegularity specificMonthRegularityInstance = new SpecificMonthRegularity()
    .Frequency(Frequency)
    .DaysOfMonth(DaysOfMonth)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
