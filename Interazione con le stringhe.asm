;Gruppo composto da: Bostan Radu, Dall'Aglio Michea, Furlani Luca, Laknitri Ilyass, Sassi Alberto e Truglia Luca, della classe 3C INF
;01/02/2024

;Interazzione con le stringhe
      
data segment
    
    msg dw "Inserisci una stringa: $"
    msg2 dw 10, 13, "Scelta:$"
    str_inv dw 10, 13, "1) Inverti una stringa$"
    str_capi dw 10, 13, "2) Capitalize$"
    str_came dw 10, 13, "3) Camelaze$"
    str_rimu dw 10, 13, "4) Rimuovere carattere$"
    str_inve dw 10, 13, "5) Invertire carattere$"
    scelta dw 10, 13, "Scegli una funziona (1-5): $"
    
    str db 255, ?, 256 dup('$')
    
ends

stack segment
    dw   256  dup(0)
ends

code segment
start:

    mov ax, data
    mov ds, ax
    mov es, ax
        
    lea dx, msg
    mov ah, 09h
    int 21h
    
    lea dx, msg2
    mov ah, 09h
    int 21h
    
    lea dx, str_inv
    mov ah, 09h
    int 21h
    
    lea dx, str_capi
    mov ah, 09h
    int 21h
    
    lea dx, str_came
    mov ah, 09h
    int 21h
    
    lea dx, str_rimu
    mov ah, 09h
    int 21h
    
    lea dx, str_inve
    mov ah, 09h
    int 21h
    
    lea dx, scelta
    mov ah, 09h
    int 21h
    
    mov ah, 01h
    int 21h
    
    cmp al, '1'
    je Scelta_1
    
    cmp al, '2'
    je Scelta_2
    
    cmp al, '3'
    je Scelta_3
    
    cmp al, '4'
    je Scelta_4
    
    cmp al, '5'
    je Scelta_5
    
    jmp Fine_programma
    
 Scelta_1:
    
    call Stringa_invertita
    jmp Fine_programma   
 
 Scelta_2:
    
    call Capitalize
    jmp Fine_programma
    
 Scelta_3:
 
    call Camelize
    jmp Fine_programma
    
 Scelta_4:
    
    call Inversione
    jmp Fine_programma
    
 Scelta_5:
    
    call Sostituzione   
    
 Fine_programma:   
    
    mov ax, 4c00h
    int 21h    
ends

end start
