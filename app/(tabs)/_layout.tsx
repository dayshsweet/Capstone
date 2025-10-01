import { StyleSheet } from 'react-native';
import {Tabs} from 'expo-router';

const _layout = () => {
  return (
   <Tabs>

    <Tabs.Screen 
        name="index" 
        options={{
            headerShown: false, 
            title: 'Home'
        }}
     />

    <Tabs.Screen 
        name="journal" 
        options={{
            headerShown: false, 
            title: 'Journal'
        }}
     />

    <Tabs.Screen 
        name="carelog" 
        options={{
            headerShown: false, 
            title: 'Care Log'
        }}
     />

    <Tabs.Screen 
        name="profile" 
        options={{
            headerShown: false, 
            title: 'Profile'
        }}
     /> 
    
    <Tabs.Screen
        name="calendar_event"
        options={{
            headerShown: false,
            title: 'Calendar'
        }}
    />
   </Tabs>
  )
}

export default _layout

const styles = StyleSheet.create({})