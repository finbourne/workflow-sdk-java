# com.finbourne.workflow.model.VersionInfo
The version metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAtCreated** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this entity was first created. | [optional] [default to OffsetDateTime]
**userIdCreated** | **String** | The unique id of the user who created this entity. | [optional] [default to String]
**requestIdCreated** | **String** | The request id of the request that created this entity. | [optional] [default to String]
**asAtModified** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime at which this entity was last updated. | [optional] [default to OffsetDateTime]
**userIdModified** | **String** | The unique id of the user who last updated this entity. | [optional] [default to String]
**requestIdModified** | **String** | The request id of the request that last updated this entity. | [optional] [default to String]
**asAtVersionNumber** | **Integer** | The integer version number for this entity (the entity was created at version 1). | [optional] [default to Integer]

```java
import com.finbourne.workflow.model.VersionInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAtCreated = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserIdCreated = "example UserIdCreated";
@jakarta.annotation.Nullable String RequestIdCreated = "example RequestIdCreated";
@jakarta.annotation.Nullable OffsetDateTime AsAtModified = OffsetDateTime.now();
@jakarta.annotation.Nullable String UserIdModified = "example UserIdModified";
@jakarta.annotation.Nullable String RequestIdModified = "example RequestIdModified";
@jakarta.annotation.Nullable Integer AsAtVersionNumber = new Integer("100.00");


VersionInfo versionInfoInstance = new VersionInfo()
    .AsAtCreated(AsAtCreated)
    .UserIdCreated(UserIdCreated)
    .RequestIdCreated(RequestIdCreated)
    .AsAtModified(AsAtModified)
    .UserIdModified(UserIdModified)
    .RequestIdModified(RequestIdModified)
    .AsAtVersionNumber(AsAtVersionNumber);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
