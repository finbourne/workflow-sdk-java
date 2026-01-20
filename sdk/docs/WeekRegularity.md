# com.finbourne.workflow.model.WeekRegularity
Week Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **Integer** | The frequency of the Week Regularity. For example, a value of 2 indicates every 2 weeks | [default to Integer]
**daysOfWeek** | **List&lt;String&gt;** | Days of the week. One or more of - Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday | [default to List<String>]
**type** | **String** | The type of Date Regularity | [default to String]

```java
import com.finbourne.workflow.model.WeekRegularity;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Frequency = new Integer("100.00");
List<String> DaysOfWeek = new List<String>();
String Type = "example Type";


WeekRegularity weekRegularityInstance = new WeekRegularity()
    .Frequency(Frequency)
    .DaysOfWeek(DaysOfWeek)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
