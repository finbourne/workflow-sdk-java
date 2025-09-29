# com.finbourne.workflow.model.TimeOfDay
A time of the day

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of Time of Day | [default to String]
**code** | **String** | Code of the Cut Label | [default to String]
**hours** | **Integer** | Hours | [default to Integer]
**minutes** | **Integer** | Minutes | [default to Integer]

```java
import com.finbourne.workflow.model.TimeOfDay;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example with CutLabelReference TimeOfDay
CutLabelReference timeOfDay = new CutLabelReference();
timeOfDay.setType(CutLabelReference.TypeEnum.CUTLABELREFERENCE);
TimeOfDay config = new TimeOfDay(timeOfDay);

```
 See all compatible oneOf types with TimeOfDay
* [CutLabelReference](./CutLabelReference.md)

* [SpecifiedTime](./SpecifiedTime.md)


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
