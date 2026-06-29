# com.finbourne.workflow.model.PropertyValue
The value of a property. Exactly one of Finbourne.Workflow.WebApi.Common.Dto.Json.Properties.PropertyValue.LabelValue, Finbourne.Workflow.WebApi.Common.Dto.Json.Properties.PropertyValue.MetricValue or Finbourne.Workflow.WebApi.Common.Dto.Json.Properties.PropertyValue.LabelValueSet should be supplied.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labelValue** | **String** | The value of a text property. | [optional] [default to String]
**metricValue** | [**MetricValue**](MetricValue.md) |  | [optional] [default to MetricValue]
**labelValueSet** | [**LabelValueSet**](LabelValueSet.md) |  | [optional] [default to LabelValueSet]

```java
import com.finbourne.workflow.model.PropertyValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String LabelValue = "example LabelValue";
MetricValue MetricValue = new MetricValue();
LabelValueSet LabelValueSet = new LabelValueSet();


PropertyValue propertyValueInstance = new PropertyValue()
    .LabelValue(LabelValue)
    .MetricValue(MetricValue)
    .LabelValueSet(LabelValueSet);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
