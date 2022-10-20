module q1a(a,b,c,d,f);
    input a,b,c,d;
    output f;
    wire [2:0] h;
    assign h = {a,b,c};

    mux8to1 stage01(~d,h,f);
    
endmodule

module mux8to1(notd,s,f);
    input notd;
    input [2:0] s;
    output reg f;

    always @(s)
    case (s)
        0: f = 0;
        1: f = 0;
        2: f = 1;
        3: f = 1;
        4: f = 1;
        5: f = 0;
        6: f = 1;
        7: f = notd;         
    endcase

endmodule

