# com.finbourne.workflow.model.CalendarReference
Reference to a Calendar in LUSID

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope of the Calendar | [default to String]
**code** | **String** | The code of the Calendar | [default to String]

```java
import com.finbourne.workflow.model.CalendarReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";


CalendarReference calendarReferenceInstance = new CalendarReference()
    .Scope(Scope)
    .Code(Code);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
