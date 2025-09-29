# com.finbourne.workflow.model.ChangeItem
Defines a change that occured to a Task

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time of the change | [default to OffsetDateTime]
**userIdModified** | **String** | The User ID that performed the change | [default to String]
**requestIdModified** | **String** | The Request ID of the request that caused the change | [default to String]
**asAtVersionNumber** | **Integer** | The AsAt Version number | [default to Integer]
**action** | **String** | The Action that resulted in the change | [default to String]
**attributeName** | **String** | The name of the attribute that has been change | [default to String]
**previousValue** | **Object** | The value of the attribute prior to the change | [optional] [default to Object]
**newValue** | **Object** | The value of the attribute following the change | [default to Object]

```java
import com.finbourne.workflow.model.ChangeItem;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AsAtModified = OffsetDateTime.now();
String UserIdModified = "example UserIdModified";
String RequestIdModified = "example RequestIdModified";
Integer AsAtVersionNumber = new Integer("100.00");
String Action = "example Action";
String AttributeName = "example AttributeName";
@jakarta.annotation.Nullable Object @jakarta.annotation.Nullable Object 

ChangeItem changeItemInstance = new ChangeItem()
    .AsAtModified(AsAtModified)
    .UserIdModified(UserIdModified)
    .RequestIdModified(RequestIdModified)
    .AsAtVersionNumber(AsAtVersionNumber)
    .Action(Action)
    .AttributeName(AttributeName)
    .PreviousValue(PreviousValue)
    .NewValue(NewValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
