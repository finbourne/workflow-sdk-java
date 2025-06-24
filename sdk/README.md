<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://fbn-prd.lusid.com/workflow*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActionLogsApi* | [**getActionLogs**](docs/ActionLogsApi.md#getactionlogs) | **GET** /api/actionlogs/{id} | [EXPERIMENTAL] GetActionLogs: Get the Action Logs for an Action Id
*ApplicationMetadataApi* | [**listAccessControlledResources**](docs/ApplicationMetadataApi.md#listaccesscontrolledresources) | **GET** /api/metadata/access/resources | ListAccessControlledResources: Get resources available for access control
*EventHandlersApi* | [**createEventHandler**](docs/EventHandlersApi.md#createeventhandler) | **POST** /api/eventhandlers | [EXPERIMENTAL] CreateEventHandler: Create a new Event Handler
*EventHandlersApi* | [**deleteEventHandler**](docs/EventHandlersApi.md#deleteeventhandler) | **DELETE** /api/eventhandlers/{scope}/{code} | [EXPERIMENTAL] DeleteEventHandler: Delete an Event Handler
*EventHandlersApi* | [**getEventHandler**](docs/EventHandlersApi.md#geteventhandler) | **GET** /api/eventhandlers/{scope}/{code} | [EXPERIMENTAL] GetEventHandler: Get an Event Handler
*EventHandlersApi* | [**listEventHandlers**](docs/EventHandlersApi.md#listeventhandlers) | **GET** /api/eventhandlers | [EXPERIMENTAL] ListEventHandlers: List Event Handlers
*EventHandlersApi* | [**updateEventHandler**](docs/EventHandlersApi.md#updateeventhandler) | **PUT** /api/eventhandlers/{scope}/{code} | [EXPERIMENTAL] UpdateEventHandler: Update an existing Event handler
*TaskDefinitionsApi* | [**createTaskDefinition**](docs/TaskDefinitionsApi.md#createtaskdefinition) | **POST** /api/taskdefinitions | CreateTaskDefinition: Create a new Task Definition
*TaskDefinitionsApi* | [**deleteTaskDefinition**](docs/TaskDefinitionsApi.md#deletetaskdefinition) | **DELETE** /api/taskdefinitions/{scope}/{code} | DeleteTaskDefinition: Delete a Task Definition
*TaskDefinitionsApi* | [**getTaskDefinition**](docs/TaskDefinitionsApi.md#gettaskdefinition) | **GET** /api/taskdefinitions/{scope}/{code} | GetTaskDefinition: Get a Task Definition
*TaskDefinitionsApi* | [**listTaskDefinitions**](docs/TaskDefinitionsApi.md#listtaskdefinitions) | **GET** /api/taskdefinitions | ListTaskDefinitions: List Task Definitions
*TaskDefinitionsApi* | [**listTasksForTaskDefinition**](docs/TaskDefinitionsApi.md#listtasksfortaskdefinition) | **GET** /api/taskdefinitions/{scope}/{code}/tasks | ListTasksForTaskDefinition: List Tasks for a Task Definition
*TaskDefinitionsApi* | [**updateTaskDefinition**](docs/TaskDefinitionsApi.md#updatetaskdefinition) | **PUT** /api/taskdefinitions/{scope}/{code} | UpdateTaskDefinition: Update an existing Task Definition
*TasksApi* | [**batchUpdateTasks**](docs/TasksApi.md#batchupdatetasks) | **PATCH** /api/tasks/$update | [EXPERIMENTAL] BatchUpdateTasks: Batch update tasks
*TasksApi* | [**createTask**](docs/TasksApi.md#createtask) | **POST** /api/tasks | CreateTask: Create a new Task
*TasksApi* | [**deleteTask**](docs/TasksApi.md#deletetask) | **DELETE** /api/tasks/{id} | DeleteTask: Delete a Task
*TasksApi* | [**deleteTasks**](docs/TasksApi.md#deletetasks) | **POST** /api/tasks/$delete | DeleteTasks: Batch Delete Tasks
*TasksApi* | [**getTask**](docs/TasksApi.md#gettask) | **GET** /api/tasks/{id} | GetTask: Get a Task
*TasksApi* | [**getTaskHistory**](docs/TasksApi.md#gettaskhistory) | **GET** /api/tasks/{id}/history | GetTaskHistory: Get the history of a Task
*TasksApi* | [**listTasks**](docs/TasksApi.md#listtasks) | **GET** /api/tasks | ListTasks: List Tasks
*TasksApi* | [**updateTask**](docs/TasksApi.md#updatetask) | **POST** /api/tasks/{id} | UpdateTask: Update a Task
*WorkersApi* | [**createWorker**](docs/WorkersApi.md#createworker) | **POST** /api/workers | CreateWorker: Create a new Worker
*WorkersApi* | [**deleteWorker**](docs/WorkersApi.md#deleteworker) | **DELETE** /api/workers/{scope}/{code} | DeleteWorker: Delete a Worker
*WorkersApi* | [**getWorker**](docs/WorkersApi.md#getworker) | **GET** /api/workers/{scope}/{code} | GetWorker: Get a Worker
*WorkersApi* | [**getWorkerResult**](docs/WorkersApi.md#getworkerresult) | **GET** /api/workers/{runId}/$result | GetWorkerResult: Get the status of a specific run of a worker with any relevant results
*WorkersApi* | [**listWorkers**](docs/WorkersApi.md#listworkers) | **GET** /api/workers | ListWorkers: List Workers
*WorkersApi* | [**runWorker**](docs/WorkersApi.md#runworker) | **POST** /api/workers/{scope}/{code}/$run | RunWorker: Run a Worker
*WorkersApi* | [**updateWorker**](docs/WorkersApi.md#updateworker) | **PUT** /api/workers/{scope}/{code} | UpdateWorker: Update a Worker


<a id="documentation-for-models"></a>
## Documentation for Models

 - [AccessControlledAction](docs/AccessControlledAction.md)
 - [AccessControlledResource](docs/AccessControlledResource.md)
 - [ActionDefinition](docs/ActionDefinition.md)
 - [ActionDefinitionResponse](docs/ActionDefinitionResponse.md)
 - [ActionDetails](docs/ActionDetails.md)
 - [ActionDetailsResponse](docs/ActionDetailsResponse.md)
 - [ActionId](docs/ActionId.md)
 - [ActionLog](docs/ActionLog.md)
 - [ActionLogItem](docs/ActionLogItem.md)
 - [ActionLogOrigin](docs/ActionLogOrigin.md)
 - [BatchUpdateTasksRequest](docs/BatchUpdateTasksRequest.md)
 - [BatchUpdateTasksResponse](docs/BatchUpdateTasksResponse.md)
 - [CalendarReference](docs/CalendarReference.md)
 - [ChangeItem](docs/ChangeItem.md)
 - [CreateChildTaskConfiguration](docs/CreateChildTaskConfiguration.md)
 - [CreateChildTasksAction](docs/CreateChildTasksAction.md)
 - [CreateChildTasksActionResponse](docs/CreateChildTasksActionResponse.md)
 - [CreateEventHandlerRequest](docs/CreateEventHandlerRequest.md)
 - [CreateNewTaskActivity](docs/CreateNewTaskActivity.md)
 - [CreateNewTaskActivityResponse](docs/CreateNewTaskActivityResponse.md)
 - [CreateTaskDefinitionRequest](docs/CreateTaskDefinitionRequest.md)
 - [CreateTaskRequest](docs/CreateTaskRequest.md)
 - [CreateWorkerRequest](docs/CreateWorkerRequest.md)
 - [CutLabelReference](docs/CutLabelReference.md)
 - [DateRegularity](docs/DateRegularity.md)
 - [DayOfYear](docs/DayOfYear.md)
 - [DayRegularity](docs/DayRegularity.md)
 - [DeleteTasksRequest](docs/DeleteTasksRequest.md)
 - [DeletedEntityResponse](docs/DeletedEntityResponse.md)
 - [ErrorDetail](docs/ErrorDetail.md)
 - [EventHandler](docs/EventHandler.md)
 - [EventHandlerMapping](docs/EventHandlerMapping.md)
 - [EventMatchingPattern](docs/EventMatchingPattern.md)
 - [Fail](docs/Fail.md)
 - [FailResponse](docs/FailResponse.md)
 - [FieldMapping](docs/FieldMapping.md)
 - [GetWorkerResultResponse](docs/GetWorkerResultResponse.md)
 - [GroupReconciliation](docs/GroupReconciliation.md)
 - [GroupReconciliationResponse](docs/GroupReconciliationResponse.md)
 - [HealthCheck](docs/HealthCheck.md)
 - [HealthCheckResponse](docs/HealthCheckResponse.md)
 - [IdSelectorDefinition](docs/IdSelectorDefinition.md)
 - [IdentifierPartSchema](docs/IdentifierPartSchema.md)
 - [InitialState](docs/InitialState.md)
 - [Link](docs/Link.md)
 - [LuminesceView](docs/LuminesceView.md)
 - [LuminesceViewResponse](docs/LuminesceViewResponse.md)
 - [LusidProblemDetails](docs/LusidProblemDetails.md)
 - [LusidValidationProblemDetails](docs/LusidValidationProblemDetails.md)
 - [PagedResourceListOfEventHandler](docs/PagedResourceListOfEventHandler.md)
 - [PagedResourceListOfTask](docs/PagedResourceListOfTask.md)
 - [PagedResourceListOfTaskDefinition](docs/PagedResourceListOfTaskDefinition.md)
 - [PagedResourceListOfWorker](docs/PagedResourceListOfWorker.md)
 - [Parameter](docs/Parameter.md)
 - [ParameterValue](docs/ParameterValue.md)
 - [ReadOnlyStates](docs/ReadOnlyStates.md)
 - [RecurrencePattern](docs/RecurrencePattern.md)
 - [RelativeMonthRegularity](docs/RelativeMonthRegularity.md)
 - [ResourceId](docs/ResourceId.md)
 - [ResourceListOfAccessControlledResource](docs/ResourceListOfAccessControlledResource.md)
 - [ResourceListOfChangeItem](docs/ResourceListOfChangeItem.md)
 - [ResourceListOfTask](docs/ResourceListOfTask.md)
 - [ResultField](docs/ResultField.md)
 - [ResultMatchingPattern](docs/ResultMatchingPattern.md)
 - [ResultantChildTaskConfiguration](docs/ResultantChildTaskConfiguration.md)
 - [RunWorkerAction](docs/RunWorkerAction.md)
 - [RunWorkerActionResponse](docs/RunWorkerActionResponse.md)
 - [RunWorkerRequest](docs/RunWorkerRequest.md)
 - [RunWorkerResponse](docs/RunWorkerResponse.md)
 - [ScheduleMatchingPattern](docs/ScheduleMatchingPattern.md)
 - [ScheduleMatchingPatternContext](docs/ScheduleMatchingPatternContext.md)
 - [SchedulerJob](docs/SchedulerJob.md)
 - [SchedulerJobResponse](docs/SchedulerJobResponse.md)
 - [Sleep](docs/Sleep.md)
 - [SleepResponse](docs/SleepResponse.md)
 - [SpecificMonthRegularity](docs/SpecificMonthRegularity.md)
 - [SpecifiedTime](docs/SpecifiedTime.md)
 - [Stack](docs/Stack.md)
 - [Task](docs/Task.md)
 - [TaskActivity](docs/TaskActivity.md)
 - [TaskActivityResponse](docs/TaskActivityResponse.md)
 - [TaskDefinition](docs/TaskDefinition.md)
 - [TaskDefinitionVersion](docs/TaskDefinitionVersion.md)
 - [TaskFieldDefinition](docs/TaskFieldDefinition.md)
 - [TaskInstanceField](docs/TaskInstanceField.md)
 - [TaskStateDefinition](docs/TaskStateDefinition.md)
 - [TaskSummary](docs/TaskSummary.md)
 - [TaskTransitionDefinition](docs/TaskTransitionDefinition.md)
 - [TimeConstraints](docs/TimeConstraints.md)
 - [TimeOfDay](docs/TimeOfDay.md)
 - [TransitionTriggerDefinition](docs/TransitionTriggerDefinition.md)
 - [TriggerParentTaskAction](docs/TriggerParentTaskAction.md)
 - [TriggerParentTaskActionResponse](docs/TriggerParentTaskActionResponse.md)
 - [TriggerSchema](docs/TriggerSchema.md)
 - [UpdateEventHandlerRequest](docs/UpdateEventHandlerRequest.md)
 - [UpdateMatchingTasksActivity](docs/UpdateMatchingTasksActivity.md)
 - [UpdateMatchingTasksActivityResponse](docs/UpdateMatchingTasksActivityResponse.md)
 - [UpdateTaskDefinitionRequest](docs/UpdateTaskDefinitionRequest.md)
 - [UpdateTaskRequest](docs/UpdateTaskRequest.md)
 - [UpdateTaskWithIdAndTriggerRequest](docs/UpdateTaskWithIdAndTriggerRequest.md)
 - [UpdateWorkerRequest](docs/UpdateWorkerRequest.md)
 - [ValueConstraints](docs/ValueConstraints.md)
 - [VersionInfo](docs/VersionInfo.md)
 - [WeekRegularity](docs/WeekRegularity.md)
 - [Worker](docs/Worker.md)
 - [WorkerConfiguration](docs/WorkerConfiguration.md)
 - [WorkerConfigurationResponse](docs/WorkerConfigurationResponse.md)
 - [WorkerStatusTriggers](docs/WorkerStatusTriggers.md)
 - [YearRegularity](docs/YearRegularity.md)

