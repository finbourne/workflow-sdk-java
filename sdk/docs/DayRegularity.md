# com.finbourne.workflow.model.DayRegularity
Day Regularity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frequency** | **Integer** | The frequency of the Day Regularity | [default to Integer]
**type** | **String** | The type of Date Regularity | [default to String]

```java
import com.finbourne.workflow.model.DayRegularity;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Frequency = new Integer("100.00");
String Type = "example Type";


DayRegularity dayRegularityInstance = new DayRegularity()
    .Frequency(Frequency)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
