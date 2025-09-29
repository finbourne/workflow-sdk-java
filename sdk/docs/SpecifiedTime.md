# com.finbourne.workflow.model.SpecifiedTime
A specified time in the day

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hours** | **Integer** | Hours | [default to Integer]
**minutes** | **Integer** | Minutes | [default to Integer]
**type** | **String** | The type of Time of Day | [default to String]

```java
import com.finbourne.workflow.model.SpecifiedTime;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Hours = new Integer("100.00");
Integer Minutes = new Integer("100.00");
String Type = "example Type";


SpecifiedTime specifiedTimeInstance = new SpecifiedTime()
    .Hours(Hours)
    .Minutes(Minutes)
    .Type(Type);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
