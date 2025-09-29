# com.finbourne.workflow.model.RelativeMonthRegularity
Relative Month Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **Integer** | The frequency of the Relative Month Regularity | [default to Integer]
**daysOfWeek** | **List&lt;String&gt;** | Days of the week | [default to List<String>]
**index** | **String** | Relative index in the month | [default to String]
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
