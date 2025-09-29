# com.finbourne.workflow.model.Stack
Information pertaining to the Tasks Stack if one is present

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**memberAddedAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the Task was added to the Stack | [optional] [default to OffsetDateTime]
**stackOpenedAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the Stack was opened | [optional] [default to OffsetDateTime]
**stackClosedAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the Stack was closed | [optional] [default to OffsetDateTime]
**stackMembershipType** | **String** | Whether the task is the Lead task of the Stack or a Member within the Stack | [optional] [default to String]
**stackStatus** | **String** | Status of the Stack (Open/Closed) | [optional] [default to String]
**leadTaskId** | [**UUID**](UUID.md) | ID of the Lead Task | [optional] [default to UUID]
**leadTaskState** | **String** | State of the Lead Task | [optional] [default to String]
**tasksInStack** | **Integer** | Number of Tasks in the Stack | [optional] [default to Integer]

```java
import com.finbourne.workflow.model.Stack;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime MemberAddedAsAt = OffsetDateTime.now();
OffsetDateTime StackOpenedAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime StackClosedAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String StackMembershipType = "example StackMembershipType";
@jakarta.annotation.Nullable String StackStatus = "example StackStatus";
UUID LeadTaskId = "example LeadTaskId";
@jakarta.annotation.Nullable String LeadTaskState = "example LeadTaskState";
Integer TasksInStack = new Integer("100.00");


Stack stackInstance = new Stack()
    .MemberAddedAsAt(MemberAddedAsAt)
    .StackOpenedAsAt(StackOpenedAsAt)
    .StackClosedAsAt(StackClosedAsAt)
    .StackMembershipType(StackMembershipType)
    .StackStatus(StackStatus)
    .LeadTaskId(LeadTaskId)
    .LeadTaskState(LeadTaskState)
    .TasksInStack(TasksInStack);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
