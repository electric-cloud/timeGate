/* ##########################################################################
#
#  triggerPipelineGateOnSchedule -- Trigger a pipeline gate with a schedule
#
#  Copyright 2016 Electric-Cloud Inc.
#
########################################################################## */
procedure 'triggerPipelineGateOnSchedule',
   description: 'Trigger a pipeline gate with a schedule',
{
   formalParameter 'action',
      description: 'approve or reject',
      required: '1',
      type: 'entry'

    formalParameter 'evidence',
      required: '0',
      type: 'entry'

    formalParameter 'flowRuntimeId',
      required: '1',
      type: 'entry'

    formalParameter 'stageName',
      required: '1',
      type: 'entry'

    formalParameter 'taskName',
      required: '1',
      type: 'entry'

  step 'Trigger',
    shell: 'ec-perl',
    command: new File(pluginDir + '/dsl/procedures/triggerPipelineGateOnSchedule/steps/trigger.pl').text

  step 'createLink',
    command: '''ectool deleteSchedule "$[/mySchedule/projectName]" "$[/mySchedule]" '''

}
