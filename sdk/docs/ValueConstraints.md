# com.finbourne.workflow.model.ValueConstraints
Constraints that should be applied to a Tasks fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**constraintType** | **String** | Whether the constraint is a suggestion or should be enforced via validation (e.g. Suggested, Validated) | [default to String]
**valueSourceType** | **String** | The source of the acceptable values (e.g. AcceptableValues) | [default to String]
**acceptableValues** | **List&lt;Object&gt;** | The acceptable values for the field | [default to List<Object>]

```java
import com.finbourne.workflow.model.ValueConstraints;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ConstraintType = "example ConstraintType";
String ValueSourceType = "example ValueSourceType";
List<Object> AcceptableValues = new List<Object>();


ValueConstraints valueConstraintsInstance = new ValueConstraints()
    .ConstraintType(ConstraintType)
    .ValueSourceType(ValueSourceType)
    .AcceptableValues(AcceptableValues);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
