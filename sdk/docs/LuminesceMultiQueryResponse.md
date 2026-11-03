# com.finbourne.workflow.model.LuminesceMultiQueryResponse
Readonly configuration for the Luminesce custom multi-query Worker

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of worker | [optional] [default to String]
**workspaceKey** | **String** | The Workspaces key of the multi-query the worker runs | [optional] [default to String]
**driveLocationAndFileName** | **String** | Where in Drive the results are saved, which may contain placeholders | [optional] [default to String]
**format** | **String** | The format the results are saved in, csv when not given | [optional] [default to String]
**mayOverwrite** | **Boolean** | Whether an existing file of the same name may be overwritten | [optional] [default to Boolean]
**driveTemplateLocation** | **String** | The Drive path of the template the results are saved with | [optional] [default to String]
**dateTimeFormat** | **String** | The format DateTime values are written in | [optional] [default to String]
**whenSomeFail** | **Boolean** | Whether the results of the queries that succeeded are still saved when others did not | [optional] [default to Boolean]
**keepForSeconds** | **Integer** | How long Luminesce keeps the results once done, in seconds | [optional] [default to Integer]

```java
import com.finbourne.workflow.model.LuminesceMultiQueryResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String WorkspaceKey = "example WorkspaceKey";
@jakarta.annotation.Nullable String DriveLocationAndFileName = "example DriveLocationAndFileName";
@jakarta.annotation.Nullable String Format = "example Format";
@jakarta.annotation.Nullable Boolean MayOverwrite = true;
@jakarta.annotation.Nullable String DriveTemplateLocation = "example DriveTemplateLocation";
@jakarta.annotation.Nullable String DateTimeFormat = "example DateTimeFormat";
@jakarta.annotation.Nullable Boolean WhenSomeFail = true;
Integer KeepForSeconds = new Integer("100.00");


LuminesceMultiQueryResponse luminesceMultiQueryResponseInstance = new LuminesceMultiQueryResponse()
    .Type(Type)
    .WorkspaceKey(WorkspaceKey)
    .DriveLocationAndFileName(DriveLocationAndFileName)
    .Format(Format)
    .MayOverwrite(MayOverwrite)
    .DriveTemplateLocation(DriveTemplateLocation)
    .DateTimeFormat(DateTimeFormat)
    .WhenSomeFail(WhenSomeFail)
    .KeepForSeconds(KeepForSeconds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
