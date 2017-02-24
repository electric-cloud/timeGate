/* ##########################################################################
#
#  createScheduleToTriggerGate -- Create a schedule that triggers a gate at a
#       particular time and date
#
#  Copyright 2016 Electric-Cloud Inc.
#
########################################################################## */
procedure 'createScheduleToTriggerGate',
    description: 'Create a schedule that trigger a gate at a particular time and date',
{
   formalParameter 'date',
      description: 'Date format: yyyy-mm-dd',
      required: '1',
      type: 'entry'
    formalParameter 'evidence',
      required: '1',
      type: 'entry'
    formalParameter 'gate',
      required: '1',
      type: 'entry'
    formalParameter 'stage',
      required: '1',
      type: 'entry'
    formalParameter 'time',
      required: '1',
      type: 'entry'
    formalParameter 'timezone',
      required: '0',
      type: 'entry'

  step 'createSchedule',
    shell: 'ec-perl',
    command: new File(pluginDir + '/dsl/procedures/createScheduleToTriggerGate/steps/createSchedule.pl').text

  step 'createLink',
    shell: 'ec-perl',
    command: new File(pluginDir + '/dsl/procedures/createScheduleToTriggerGate/steps/createLink.pl').text

  step 'addPermission',
    shell: 'ec-perl',
    command: new File(pluginDir + '/dsl/procedures/createScheduleToTriggerGate/steps/addPermission.pl').text
}
