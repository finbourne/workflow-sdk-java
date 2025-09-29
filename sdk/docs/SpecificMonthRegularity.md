# com.finbourne.workflow.model.SpecificMonthRegularity
Specific Month Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **Integer** | The frequency of the Specific Month Regularity | [default to Integer]
**daysOfMonth** | **List&lt;Integer&gt;** | Days of the month | [default to List<Integer>]
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
