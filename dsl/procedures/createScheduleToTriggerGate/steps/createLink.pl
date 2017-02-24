$[/plugins/EC-Admin/project/scripts/perlHeaderJSON]
my ($ok, $json, $errCode, $errMSg) = InvokeCommander("",
	'setProperty', "/myPipelineStageRuntime/ec_summary[$[stage] Schedule $[date] $[time] $[timezone]]",
	{
		value =>  '<html><a href="/commander/link/editSchedule/projects/$[/myPipelineRuntime/projectName]/schedules/$[/myJob/stage]_$[/myPipelineRuntime]">Definition</a></html>'
	});
$[/plugins/EC-Admin/project/scripts/perlLibJSON]
