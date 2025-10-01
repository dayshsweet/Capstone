import { StyleSheet, Text, View } from 'react-native'
import React, {useState} from 'react'
import { Calendar, CalendarList, Agenda, LocaleConfig } from 'react-native-calendars';

const calendar_events = () => {

  const [selected, setSelected] = useState('');

  return (
    <View className="flex-1 items-center justify-center bg-pink-100">
      <Text className="text-5xl font-bold text-primary">Calendar</Text>

{/* create a react native calendar component */}
    <Calendar 

      style={{
        borderWidth: 1,
        borderColor: 'gray',
        height: 350,
      }}
      theme={{
        backgroundColor: '#ffffff',
        calendarBackground: '#ffffff',
        textSectionTitleColor: '#b6c1cd',
        selectedDayBackgroundColor: '#00adf5',
        selectedDayTextColor: '#ffffff',
        todayTextColor: '#00adf5',
        dayTextColor: '#2d4150',
        textDisabledColor: '#dd99ee'
      }}

      onDayPress={
        day => {
          console.log('selected day', day);
        }}
      markedDates={{
        [selected]: {selected: true, disableTouchEvent: true, selectedColor: 'orange'}
      }}
    />

    </View>
  )
}

export default calendar_events

const styles = StyleSheet.create({})