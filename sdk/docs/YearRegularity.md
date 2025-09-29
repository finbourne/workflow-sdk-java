# com.finbourne.workflow.model.YearRegularity
Year Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dates** | [**List&lt;DayOfYear&gt;**](DayOfYear.md) | The dates in the year | [default to List<DayOfYear>]
**type** | **String** | The type of Date Regularity | [default to String]

```java
import com.finbourne.workflow.model.YearRegularity;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<DayOfYear> Dates = new List<DayOfYear>();
String Type = "example Type";


YearRegularity yearRegularityInstance = new YearRegularity()
    .Dates(Dates)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
