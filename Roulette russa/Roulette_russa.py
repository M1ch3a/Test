import random
import winsound

def giocata():

    casuale=random.randint(0,1)
    
    if casuale==1:
        danno='bang'
    else:
        danno='click'
    print(danno)

    return danno

fine=False
victory=False
vite_player=4
vite_computer=4
turno=1

print('---------------INIZIO DEL GIOCO-----------------')

while fine==False:

    print(f'\n- ROUND {turno})\n')
    print(f'Le tue vite:     {vite_player}')
    print(f'Le vite del bot: {vite_computer}\n')
    
    scelta=input('Che scelta vuoi fare (scelta: io,bot): ').lower()
    danno=giocata()
    if danno=='bang':
        if scelta=='io':
            vite_player-=1
        elif scelta=='bot':
            vite_computer-=1
        else:
            print('Hai sparato al vuoto, perchè non hai scelto a chi mirare\n')

    scelta=random.randint(0,1)
    if scelta==0:
        print('Il computer sceglie se stesso')
    else:
        print('Il computer sceglie te')
    danno=giocata()
    
    if danno=='bang':
        if scelta==0:
            vite_computer-=1
        else:
            vite_player-=1

    if vite_player<=0:
        fine=True
    elif vite_computer<=0:
        fine=True
        victory=True

    turno+=1

print('\n\n---------------FINE DEL GIOCO-----------------')
if victory==True:
    winsound.PlaySound('Sound_victory',0)
    print('Hai vinto')
else:
    winsound.PlaySound('ahahah_Simpson',0)
    print('Hai perso')
