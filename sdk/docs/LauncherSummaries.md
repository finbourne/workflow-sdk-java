# com.finbourne.workflow.model.LauncherSummaries
Sentences that say what a Launcher does, meant to be shown to a person.   These are rendered on read from the stored Launcher details. They are never stored and never accepted on a write, so the same Launcher always reads back the same summaries

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schedule** | **String** | A sentence that says when the Launcher starts a run, for example \&quot;At 09:00 every weekday, London time\&quot;.   Null for an Event Launcher, which has no schedule | [optional] [default to String]
**fields** | **Map&lt;String, String&gt;** | A sentence for each field of the root task the Launcher fills, keyed by the field name on the root task definition. Empty when the Launcher fills no fields | [optional] [default to Map<String, String>]

```java
import com.finbourne.workflow.model.LauncherSummaries;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Schedule = "example Schedule";
@jakarta.annotation.Nullable Map<String, String> Fields = new Map<String, String>();


LauncherSummaries launcherSummariesInstance = new LauncherSummaries()
    .Schedule(Schedule)
    .Fields(Fields);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
