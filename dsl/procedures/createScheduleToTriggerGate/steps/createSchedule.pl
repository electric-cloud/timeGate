$[/plugins/EC-Admin/project/scripts/perlHeaderJSON]
  my ($ok, $json, $errCode, $errMsg) = InvokeCommander("",
	'createSchedule', "$[/myPipelineRuntime/projectName]", "$[/myJob/stage]_$[/myPipelineRuntime]", {
	  'beginDate' => "$[date]",
	  'startTime' => "$[time]",
	  'timeZone' => "$[timezone]",
	  'procedureName' => "/myProject/procedures/triggerPipelineGateOnSchedule",
	  'misfirePolicy' => "runOnce",
	  actualParameter => [
		  {actualParameterName => 'stageName', value => "$[stage]"},
		  {actualParameterName => 'taskName', value => "$[gate]"},
		  {actualParameterName => 'action', value => "approve"},
		  {actualParameterName => 'evidence', value => "$[evidence]"},
		  {actualParameterName => 'flowRuntimeId', value => "$[/myPipelineRuntime/flowRuntimeId]"}
	  ]
	});
$[/plugins/EC-Admin/project/scripts/perlLibJSON]
