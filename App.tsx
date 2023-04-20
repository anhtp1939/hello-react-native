import React from 'react';
import {View, Button} from 'react-native';
import CocosGameStarter from './ts/CocosGameStarter';

function App(): JSX.Element {
  return (
    <View>
      <Button
        onPress={() => {
          CocosGameStarter.startGame("happy-pop");
        }}
        title={'Happy Pop'}
      />
      <Button
        onPress={() => {
          CocosGameStarter.startGame("lader-run");
        }}
        title={'Lader Run'}
      />
    </View>
  );
}

export default App;
