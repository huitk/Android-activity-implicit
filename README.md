# Android-activity-implicit

Part 1

• The app has built in default percentages for ‘excellent’, ‘average’ and ‘lacking’ service during the meal but not everyone
  would agree with these percentages. You are going to add an update button to the bottom of this first activity which will 
  take the user to a second activity where they can enter their preferred percentages for the different levels. You can design 
  this new activity layout however you like but the user should see the current percentages (as hints) for each type of service 
  and be able to modify some or all of them (using a ‘Save’ button which exits the activity) or cancel (using the back button).
• Add the new activity. The best way is in Studio itself (File->new->Activity->EmptyActivity) because it will then update the
  AndroidManifest correctly. The layout for the new activity is up to you but it must display the current percentages for 
  ‘excellent’, ‘average’ and ‘lacking’ service that will be passed in via the intent.
• These values should be editable by the user. There should also be a button that ‘Save’ these values and passes them back 
  (immediately) to the first activity. The back button should both also return the user to the first activity – with no changes 
  to the percentages. Remember, when passing values back, the names of the parameters must have the full classname of your app.
  

  
  
  
