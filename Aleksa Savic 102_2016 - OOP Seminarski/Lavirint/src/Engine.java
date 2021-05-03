
public class Engine {

	int[][] matrica=new int[25][25]; /*matrica 25x25*/
	int nivo=1; /*broj nivoa tj godine */
	int l,k;	/*trenutna pozicija igraca*/
	int broj=6;/*broj ispita 6-43*/
	int z=0;/* indikator da je ispit */
	
	public Engine()
	{
		nivo1();
	}
	
	public void nivo1()
	{
		nivo=1;
		broj=6;
		/*svetlo plava je 0*/
		for(int i=0;i<25;i++)
			for(int j=0;j<25;j++)
				matrica[i][j]=0;
		
		/*tamno plava je 1*/
		for(int i=0;i<25;i++)
		{
			matrica[i][0]=1;
			matrica[0][i]=1;
			matrica[i][24]=1;
			matrica[24][i]=1;
		}
		/*2 je aleksina slika iz indeksa*/
		matrica[12][0]=2;
		/*4 je kraj nivoa */
		matrica[12][24]=4;
		
		
		/*postavljanje tamno plave */
		matrica[1][5]=1;
		matrica[1][6]=1;
		matrica[1][7]=1;
		matrica[1][8]=1;
		matrica[1][9]=1;
		matrica[1][11]=1;
		matrica[1][12]=1;
		matrica[1][14]=1;
		matrica[1][15]=1;
		matrica[1][17]=1;
		matrica[1][19]=1;
		
		matrica[2][1]=1;
		matrica[2][2]=1;
		matrica[2][3]=1;
		matrica[2][21]=1;
		matrica[2][22]=1;
		
		matrica[3][3]=1;
		matrica[3][4]=1;
		matrica[3][5]=1;
		for(int i=7;i<=19;i++)
			matrica[3][i]=1;
		matrica[3][22]=1;
		
		matrica[4][2]=1;
		matrica[4][3]=1;
		matrica[4][7]=1;
		matrica[4][11]=1;
		matrica[4][19]=1;
		matrica[4][21]=1;
		matrica[4][22]=1;
		
		matrica[5][2]=1;
		matrica[5][3]=1;
		matrica[5][4]=1;
		matrica[5][5]=1;
		matrica[5][7]=1;
		matrica[5][9]=1;
		matrica[5][11]=1;
		for(int i=13;i<=17;i++)
			matrica[5][i]=1;
		matrica[5][19]=1;
		matrica[5][21]=1;
		matrica[5][22]=1;
		matrica[5][23]=1;
		
		
		matrica[6][4]=1;
		matrica[6][9]=1;
		matrica[6][11]=1;
		matrica[6][13]=1;
		matrica[6][15]=1;
		matrica[6][17]=1;
		matrica[6][19]=1;
		
		matrica[7][2]=1;
		for(int i=4;i<=9;i++)
			matrica[7][i]=1;
		matrica[7][11]=1;
		matrica[7][13]=1;
		matrica[7][17]=1;
		for(int i=19;i<=22;i++)
			matrica[7][i]=1;
		
		matrica[8][2]=1;
		matrica[8][4]=1;
		matrica[8][9]=1;
		matrica[8][11]=1;
		matrica[8][12]=1;
		matrica[8][13]=1;
		matrica[8][15]=1;
		matrica[8][17]=1;
		matrica[8][22]=1;
		
		matrica[9][2]=1;
		matrica[9][4]=1;
		matrica[9][6]=1;
		matrica[9][7]=1;
		matrica[9][9]=1;
		matrica[9][11]=1;
		matrica[9][15]=1;
		matrica[9][17]=1;
		matrica[9][18]=1;
		matrica[9][19]=1;
		matrica[9][20]=1;
		matrica[9][22]=1;
		
		matrica[10][2]=1;
		matrica[10][4]=1;
		matrica[10][6]=1;
		matrica[10][7]=1;
		matrica[10][9]=1;
		matrica[10][11]=1;
		matrica[10][13]=1;
		matrica[10][15]=1;
		matrica[10][22]=1;
		
		matrica[11][1]=1;
		matrica[11][2]=1;
		matrica[11][4]=1;
		matrica[11][7]=1;
		matrica[11][9]=1;
		matrica[11][11]=1;
		for(int i=13;i<=20;i++)
			matrica[11][i]=1;
		matrica[11][22]=1;
		
		for(int i=4;i<=7;i++)
			matrica[12][i]=1;
		matrica[12][9]=1;
		matrica[12][11]=1;
		matrica[12][16]=1;
		matrica[12][17]=1;
		matrica[12][18]=1;
		matrica[12][20]=1;
		matrica[12][22]=1;
		
		matrica[13][2]=1;
		matrica[13][9]=1;
		for(int i=11;i<=14;i++)
			matrica[13][i]=1;
		matrica[13][20]=1;
		matrica[13][22]=1;
		
		for(int i=2;i<=7;i++)
			matrica[14][i]=1;
		matrica[14][9]=1;
		for(int i=16;i<=20;i++)
			matrica[14][i]=1;
		matrica[14][22]=1;
		
		matrica[15][4]=1;
		for(int i=9;i<=20;i++)
			matrica[15][i]=1;
		matrica[15][22]=1;
		matrica[15][23]=1;
		
		matrica[16][2]=1;
		matrica[16][3]=1;
		matrica[16][4]=1;
		matrica[16][6]=1;
		matrica[16][7]=1;
		matrica[16][8]=1;
		matrica[16][9]=1;
		matrica[16][20]=1;
		matrica[16][22]=1;
		
		matrica[17][2]=1;
		matrica[17][7]=1;
		matrica[17][9]=1;
		matrica[17][11]=1;
		matrica[17][12]=1;
		matrica[17][13]=1;
		matrica[17][14]=1;
		matrica[17][16]=1;
		matrica[17][17]=1;
		matrica[17][18]=1;
		matrica[17][20]=1;
		matrica[17][22]=1;
	
		matrica[18][2]=1;
		matrica[18][3]=1;
		matrica[18][5]=1;
		matrica[18][7]=1;
		matrica[18][13]=1;
		matrica[18][14]=1;
		matrica[18][18]=1;
		matrica[18][20]=1;
		matrica[18][22]=1;
		
		matrica[19][2]=1;
		matrica[19][3]=1;
		for(int i=5;i<=11;i++)
			matrica[19][i]=1;
		matrica[19][13]=1;
		matrica[19][16]=1;
		matrica[19][17]=1;
		matrica[19][18]=1;
		matrica[19][20]=1;
		matrica[19][22]=1;
		
		matrica[20][2]=1;
		matrica[20][13]=1;
		matrica[20][14]=1;
		matrica[20][16]=1;
		matrica[20][18]=1;
		matrica[20][20]=1;
		matrica[20][22]=1;
		
		for(int i=2;i<=5;i++)
			matrica[21][i]=1;
		matrica[21][7]=1;
		matrica[21][8]=1;
		matrica[21][9]=1;
		matrica[21][11]=1;
		matrica[21][13]=1;
		matrica[21][16]=1;
		matrica[21][20]=1;
		matrica[21][22]=1;
		
		
		matrica[22][5]=1;
		matrica[22][7]=1;
		for(int i=9;i<=14;i++)
			matrica[22][i]=1;
		for(int i=16;i<=20;i++)
			matrica[22][i]=1;
		matrica[22][22]=1;
		
		matrica[23][2]=1;
		matrica[23][3]=1;
		matrica[23][5]=1;
		matrica[23][14]=1;
		
		/*5 je gde se nalazi ispit */
		matrica[13][7]=5;
		matrica[18][4]=5;
		matrica[20][7]=5;
		matrica[22][15]=5;
		matrica[10][19]=5;
		matrica[12][12]=5;
		matrica[7][10]=5;
		matrica[5][6]=5;
		matrica[2][11]=5;
		matrica[6][23]=5;
			
	}
	public void nivo2()
	{
		nivo=2;
		broj=16;
		for(int i=0;i<25;i++)
			for(int j=0;j<25;j++)
				matrica[i][j]=0;
		for(int i=0;i<25;i++)
		{
			matrica[i][0]=1;
			matrica[0][i]=1;
			matrica[i][24]=1;
			matrica[24][i]=1;
		}
		matrica[12][0]=2;
		matrica[12][24]=4;
		
		matrica[1][8]=1;
		matrica[1][15]=1;
		
		for(int i=2;i<=6;i++)
			matrica[2][i]=1;
		for(int i=10;i<=13;i++)
			matrica[2][i]=1;
		for(int i=17;i<=22;i++)
			matrica[2][i]=1;
		
		matrica[3][2]=1;
		matrica[3][6]=1;
		matrica[3][8]=1;
		matrica[3][9]=1;
		matrica[3][10]=1;
		matrica[3][12]=1;
		matrica[3][13]=1;
		matrica[3][15]=1;
		matrica[3][16]=1;
		matrica[3][17]=1;
		matrica[3][22]=1;
		
		matrica[4][2]=1;
		matrica[4][4]=1;
		matrica[4][6]=1;
		matrica[4][8]=1;
		matrica[4][13]=1;
		matrica[4][15]=1;
		matrica[4][19]=1;
		matrica[4][20]=1;
		matrica[4][22]=1;
		
		matrica[5][2]=1;
		matrica[5][4]=1;
		matrica[5][6]=1;
		matrica[5][8]=1;
		matrica[5][10]=1;
		matrica[5][11]=1;
		matrica[5][13]=1;
		matrica[5][15]=1;
		matrica[5][17]=1;
		matrica[5][18]=1;
		matrica[5][19]=1;
		matrica[5][20]=1;
		matrica[5][22]=1;
		
		matrica[6][2]=1;
		matrica[6][4]=1;
		matrica[6][6]=1;
		matrica[6][8]=1;
		matrica[6][11]=1;
		matrica[6][13]=1;
		matrica[6][15]=1;
		matrica[6][17]=1;
		matrica[6][20]=1;
		matrica[6][22]=1;
		
		matrica[7][2]=1;
		matrica[7][4]=1;
		matrica[7][6]=1;
		matrica[7][8]=1;
		matrica[7][9]=1;
		matrica[7][11]=1;
		matrica[7][13]=1;
		matrica[7][15]=1;
		matrica[7][17]=1;
		matrica[7][18]=1;
		matrica[7][20]=1;
		matrica[7][22]=1;
		
		matrica[8][2]=1;
		matrica[8][4]=1;
		matrica[8][6]=1;
		matrica[8][8]=1;
		matrica[8][11]=1;
		matrica[8][18]=1;
		matrica[8][20]=1;
		matrica[8][22]=1;
		
		matrica[9][2]=1;
		matrica[9][4]=1;
		matrica[9][6]=1;
		matrica[9][8]=1;
		matrica[9][10]=1;
		matrica[9][11]=1;
		matrica[9][13]=1;
		matrica[9][14]=1;
		matrica[9][15]=1;
		matrica[9][16]=1;
		matrica[9][18]=1;
		matrica[9][20]=1;
		matrica[9][22]=1;
		
		matrica[10][2]=1;
		matrica[10][4]=1;
		matrica[10][8]=1;
		matrica[10][10]=1;
		matrica[10][11]=1;
		matrica[10][12]=1;
		matrica[10][13]=1;
		matrica[10][16]=1;
		matrica[10][18]=1;
		matrica[10][22]=1;
		
		for(int i=2;i<=10;i++)
			matrica[11][i]=1;
		matrica[11][12]=1;
		matrica[11][13]=1;
		matrica[11][14]=1;
		matrica[11][16]=1;
		for(int i=18;i<=23;i++)
			matrica[11][i]=1;
		
		matrica[12][2]=1;
		matrica[12][4]=1;
		matrica[12][5]=1;
		matrica[12][13]=1;
		matrica[12][14]=1;
		matrica[12][16]=1;
		matrica[12][22]=1;
	
		matrica[13][2]=1;
		matrica[13][4]=1;
		for(int i=7;i<=11;i++)
			matrica[13][i]=1;
		matrica[13][13]=1;
		matrica[13][18]=1;
		matrica[13][19]=1;
		matrica[13][20]=1;
		matrica[13][22]=1;
		
		matrica[14][2]=1;
		matrica[14][4]=1;
		matrica[14][5]=1;
		matrica[14][7]=1;
		matrica[14][11]=1;
		matrica[14][13]=1;
		matrica[14][14]=1;
		matrica[14][15]=1;
		matrica[14][16]=1;
		matrica[14][18]=1;
		matrica[14][22]=1;
		
		matrica[15][2]=1;
		matrica[15][5]=1;
		matrica[15][7]=1;
		matrica[15][8]=1;
		matrica[15][9]=1;
		matrica[15][11]=1;
		matrica[15][15]=1;
		matrica[15][16]=1;
		matrica[15][17]=1;
		matrica[15][18]=1;
		matrica[15][20]=1;
		matrica[15][22]=1;
		
		matrica[16][2]=1;
		matrica[16][4]=1;
		matrica[16][5]=1;
		matrica[16][7]=1;
		matrica[16][11]=1;
		matrica[16][12]=1;
		matrica[16][13]=1;
		matrica[16][15]=1;
		matrica[16][20]=1;
		matrica[16][22]=1;
		
		matrica[17][2]=1;
		matrica[17][4]=1;
		matrica[17][7]=1;
		matrica[17][9]=1;
		matrica[17][13]=1;
		matrica[17][15]=1;
		matrica[17][17]=1;
		matrica[17][18]=1;
		matrica[17][19]=1;
		matrica[17][20]=1;
		matrica[17][22]=1;
		
		matrica[18][2]=1;
		matrica[18][4]=1;
		matrica[18][5]=1;
		matrica[18][7]=1;
		matrica[18][9]=1;
		matrica[18][10]=1;
		matrica[18][11]=1;
		matrica[18][13]=1;
		matrica[18][15]=1;
		matrica[18][17]=1;
		matrica[18][22]=1;
		
		matrica[19][2]=1;
		matrica[19][5]=1;
		matrica[19][7]=1;
		matrica[19][9]=1;
		matrica[19][11]=1;
		matrica[19][13]=1;
		matrica[19][17]=1;
		matrica[19][19]=1;
		matrica[19][20]=1;
		matrica[19][21]=1;
		matrica[19][22]=1;
		
		matrica[20][2]=1;
		matrica[20][4]=1;
		matrica[20][5]=1;
		matrica[20][7]=1;
		matrica[20][9]=1;
		matrica[20][11]=1;
		matrica[20][13]=1;
		matrica[20][15]=1;
		matrica[20][17]=1;
		matrica[20][22]=1;
		
		matrica[21][2]=1;
		matrica[21][4]=1;
		matrica[21][9]=1;
		matrica[21][11]=1;
		for(int i=13;i<=20;i++)
			matrica[21][i]=1;
		matrica[21][22]=1;
		
		for(int i=2;i<=9;i++)
			matrica[22][i]=1;
		matrica[22][3]=0;
		matrica[22][11]=1;
		matrica[22][16]=1;
		matrica[22][20]=1;
		matrica[22][21]=1;
		matrica[22][22]=1;
		
		matrica[23][11]=1;
		matrica[23][13]=1;
		matrica[23][14]=1;
		matrica[23][18]=1;
		
		
		matrica[3][1]=5;
		matrica[2][9]=5;
		matrica[8][15]=5;
		matrica[12][19]=5;
		matrica[16][16]=5;
		matrica[12][12]=5;
		matrica[16][6]=5;
		matrica[17][11]=5;
		matrica[23][16]=5;
		matrica[15][23]=5;
	}
	
	public void nivo3()
	{
		nivo=3;
		broj=26;
		for(int i=0;i<25;i++)
			for(int j=0;j<25;j++)
				matrica[i][j]=0;
		for(int i=0;i<25;i++)
		{
			matrica[i][0]=1;
			matrica[0][i]=1;
			matrica[i][24]=1;
			matrica[24][i]=1;
		}
		matrica[12][0]=2;
		matrica[12][24]=4;
		
		matrica[1][1]=1;
		matrica[1][7]=1;
		matrica[1][11]=1;
		matrica[1][16]=1;
		for(int i=18;i<=23;i++)
			matrica[1][i]=1;
		
		for(int i=3;i<=7;i++)
			matrica[2][i]=1;
		matrica[2][9]=1;
		matrica[2][11]=1;
		matrica[2][13]=1;
		matrica[2][14]=1;
		matrica[2][16]=1;
		
		matrica[3][2]=1;
		matrica[3][3]=1;
		matrica[3][7]=1;
		matrica[3][9]=1;
		matrica[3][13]=1;
		matrica[3][14]=1;
		matrica[3][16]=1;
		matrica[3][17]=1;
		matrica[3][18]=1;
		matrica[3][20]=1;
		matrica[3][21]=1;
		matrica[3][22]=1;
		
		matrica[4][3]=1;
		matrica[4][5]=1;
		matrica[4][7]=1;
		for(int i=9;i<=14;i++)
			matrica[4][i]=1;
		matrica[4][18]=1;
		matrica[4][22]=1;
		
		matrica[5][1]=1;
		matrica[5][3]=1;
		matrica[5][5]=1;
		matrica[5][9]=1;
		matrica[5][14]=1;
		matrica[5][15]=1;
		matrica[5][16]=1;
		matrica[5][18]=1;
		matrica[5][19]=1;
		matrica[5][20]=1;
		matrica[5][22]=1;
		
		matrica[6][3]=1;
		for(int i=5;i<=12;i++)
			matrica[6][i]=1;
		matrica[6][20]=1;
		matrica[6][22]=1;
		
		matrica[7][2]=1;
		matrica[7][3]=1;
		matrica[7][5]=1;
		matrica[7][6]=1;
		matrica[7][12]=1;
		for(int i=14;i<=18;i++)
			matrica[7][i]=1;
		matrica[7][20]=1;
		matrica[7][22]=1;
		
		matrica[8][2]=1;
		matrica[8][8]=1;
		matrica[8][9]=1;
		matrica[8][10]=1;
		matrica[8][12]=1;
		matrica[8][18]=1;
		matrica[8][22]=1;
		
		matrica[9][2]=1;
		matrica[9][3]=1;
		matrica[9][4]=1;
		matrica[9][6]=1;
		matrica[9][7]=1;
		matrica[9][8]=1;
		matrica[9][10]=1;
		for(int i=12;i<=20;i++)
			matrica[9][i]=1;
		matrica[9][22]=1;
		matrica[9][23]=1;
		
		matrica[10][4]=1;
		matrica[10][6]=1;
		matrica[10][10]=1;
		matrica[10][20]=1;
		
		matrica[11][1]=1;
		matrica[11][2]=1;
		matrica[11][4]=1;
		matrica[11][6]=1;
		matrica[11][8]=1;
		matrica[11][10]=1;
		for(int i=12;i<=18;i++)
			matrica[11][i]=1;
		matrica[11][20]=1;
		matrica[11][21]=1;
		matrica[11][22]=1;
		
		matrica[12][2]=1;
		matrica[12][4]=1;
		matrica[12][6]=1;
		matrica[12][7]=1;
		matrica[12][8]=1;
		matrica[12][10]=1;
		matrica[12][12]=1;
		matrica[12][20]=1;
		matrica[12][22]=1;
		
		matrica[13][2]=1;
		matrica[13][4]=1;
		matrica[13][8]=1;
		matrica[13][12]=1;
		for(int i=14;i<=20;i++)
			matrica[13][i]=1;
		matrica[13][22]=1;
		matrica[13][23]=1;
		matrica[13][15]=0;
		
		matrica[14][2]=1;
		for(int i=4;i<=12;i++)
			matrica[14][i]=1;
		matrica[14][14]=1;
		matrica[14][16]=1;
		matrica[14][17]=1;
		matrica[14][18]=1;
		matrica[14][23]=1;
		
		matrica[15][2]=1;
		matrica[15][14]=1;
		for(int i=18;i<=21;i++)
			matrica[15][i]=1;
		
		for(int i=2;i<=6;i++)
			matrica[16][i]=1;
		for(int i=8;i<=16;i++)
			matrica[16][i]=1;
		matrica[16][21]=1;
		matrica[16][22]=1;
		
		matrica[17][6]=1;
		matrica[17][16]=1;
		matrica[17][17]=1;
		matrica[17][18]=1;
		matrica[17][20]=1;
		matrica[17][21]=1;
		
		for(int i=1;i<=4;i++)
			matrica[18][i]=1;
		for(int i=6;i<=14;i++)
			matrica[18][i]=1;
		matrica[18][7]=0;
		matrica[18][16]=1;
		matrica[18][18]=1;
		matrica[18][21]=1;
		matrica[18][23]=1;
		
		matrica[19][6]=1;
		matrica[19][14]=1;
		matrica[19][18]=1;
		matrica[19][19]=1;
		matrica[19][21]=1;
		
		for(int i=2;i<=14;i++)
			matrica[20][i]=1;
		for(int i=16;i<=22;i++)
			matrica[20][i]=1;
		
		matrica[21][2]=1;
		matrica[21][6]=1;
		matrica[21][10]=1;
		matrica[21][14]=1;
		matrica[21][18]=1;
		matrica[21][22]=1;
		
		matrica[22][2]=1;
		matrica[22][4]=1;
		matrica[22][6]=1;
		matrica[22][8]=1;
		matrica[22][10]=1;
		matrica[22][12]=1;
		matrica[22][14]=1;
		matrica[22][16]=1;
		matrica[22][18]=1;
		matrica[22][20]=1;
		matrica[22][22]=1;
		
		matrica[23][4]=1;
		matrica[23][8]=1;
		matrica[23][12]=1;
		matrica[23][16]=1;
		matrica[23][20]=1;
		
		matrica[23][2]=5;
		matrica[21][12]=5;
		matrica[16][7]=5;
		matrica[13][13]=5;
		matrica[10][12]=5;
		matrica[8][6]=5;
		matrica[3][10]=5;
		matrica[6][18]=5;
	}
	public void nivo4()
	{
		nivo=4;
		broj=34;
		for(int i=0;i<25;i++)
			for(int j=0;j<25;j++)
				matrica[i][j]=0;
		
		for(int i=0;i<25;i++)
		{
			matrica[i][0]=1;
			matrica[0][i]=1;
			matrica[i][24]=1;
			matrica[24][i]=1;
		}
		matrica[12][0]=2;
		matrica[12][24]=4;
		
		matrica[1][2]=1;
		matrica[1][8]=1;
		matrica[1][9]=1;
		matrica[1][10]=1;
		matrica[1][17]=1;
		matrica[1][18]=1;
		matrica[1][19]=1;
		
		matrica[2][2]=1;
		matrica[2][4]=1;
		matrica[2][5]=1;
		matrica[2][6]=1;
		for(int i=12;i<=15;i++)
			matrica[2][i]=1;
		matrica[2][21]=1;
		matrica[2][22]=1;
	
		matrica[3][1]=1;
		matrica[3][2]=1;
		matrica[3][4]=1;
		matrica[3][14]=1;
		for(int i=6;i<=12;i++)
			matrica[3][i]=1;
		for(int i=15;i<=22;i++)
			matrica[3][i]=1;
		
		matrica[4][4]=1;
		matrica[4][22]=1;
		
		matrica[5][2]=1;
		matrica[5][3]=1;
		matrica[5][4]=1;
		for(int i=6;i<=20;i++)
			matrica[5][i]=1;
		matrica[5][22]=1;
		
		matrica[6][4]=1;
		matrica[6][11]=1;
		matrica[6][19]=1;
		matrica[6][20]=1;
		matrica[6][22]=1;
		
		matrica[7][1]=1;
		matrica[7][2]=1;
		matrica[7][4]=1;
		for(int i=6;i<=11;i++)
			matrica[7][i]=1;
		for(int i=13;i<=18;i++)
			matrica[7][i]=1;
		matrica[7][20]=1;
		matrica[7][22]=1;
		
		matrica[8][4]=1;
		matrica[8][11]=1;
		matrica[8][13]=1;
		matrica[8][14]=1;
		matrica[8][16]=1;
		matrica[8][18]=1;
		matrica[8][20]=1;
		matrica[8][22]=1;
		
		for(int i=2;i<=9;i++)
			matrica[9][i]=1;
		matrica[9][11]=1;
		matrica[9][17]=1;
		matrica[9][18]=1;
		matrica[9][20]=1;
		matrica[9][22]=1;
		
		matrica[10][11]=1;
		matrica[10][13]=1;
		matrica[10][14]=1;
		matrica[10][15]=1;
		matrica[10][18]=1;
		matrica[10][20]=1;
		matrica[10][22]=1;
		
		for(int i=1;i<=11;i++)
			matrica[11][i]=1;
		matrica[11][13]=1;
		matrica[11][15]=1;
		matrica[11][16]=1;
		matrica[11][18]=1;
		matrica[11][20]=1;
		matrica[11][22]=1;
		
		matrica[12][13]=1;
		matrica[12][18]=1;
		matrica[12][22]=1;
		
		for(int i=1;i<=11;i++)
			matrica[13][i]=1;
		matrica[13][13]=1;
		matrica[13][15]=1;
		matrica[13][16]=1;
		matrica[13][18]=1;
		matrica[13][20]=1;
		matrica[13][22]=1;
		
		matrica[14][11]=1;
		matrica[14][13]=1;
		matrica[14][14]=1;
		matrica[14][15]=1;
		matrica[14][18]=1;
		matrica[14][20]=1;
		matrica[14][22]=1;
		
		for(int i=2;i<=9;i++)
			matrica[15][i]=1;
		matrica[15][11]=1;
		matrica[15][13]=1;
		matrica[15][17]=1;
		matrica[15][18]=1;
		matrica[15][20]=1;
		matrica[15][22]=1;
		
		matrica[16][4]=1;
		matrica[16][11]=1;
		matrica[16][13]=1;
		matrica[16][14]=1;
		matrica[16][16]=1;
		matrica[16][18]=1;
		matrica[16][20]=1;
		matrica[16][22]=1;
		
		matrica[17][1]=1;
		matrica[17][2]=1;
		matrica[17][4]=1;
		for(int i=6;i<=11;i++)
			matrica[17][i]=1;
		for(int i=13;i<=18;i++)
			matrica[17][i]=1;
		matrica[17][20]=1;
		matrica[17][22]=1;
		
		matrica[18][4]=1;
		matrica[18][11]=1;
		matrica[18][20]=1;
		matrica[18][22]=1;
		
		matrica[19][2]=1;
		matrica[19][3]=1;
		matrica[19][4]=1;
		for(int i=6;i<=20;i++)
			matrica[19][i]=1;
		matrica[19][22]=1;
		
		matrica[20][4]=1;
		matrica[20][22]=1;
		
		matrica[21][1]=1;
		matrica[21][2]=1;
		matrica[21][4]=1;
		matrica[21][14]=1;
		for(int i=6;i<=12;i++)
			matrica[21][i]=1;
		for(int i=15;i<=22;i++)
			matrica[21][i]=1;
		
		matrica[22][2]=1;
		matrica[22][4]=1;
		matrica[22][5]=1;
		matrica[22][6]=1;
		for(int i=12;i<=15;i++)
			matrica[22][i]=1;
		matrica[22][21]=1;
		matrica[22][22]=1;
		
		matrica[23][2]=1;
		matrica[23][8]=1;
		matrica[23][9]=1;
		matrica[23][10]=1;
		matrica[23][17]=1;
		matrica[23][18]=1;
		matrica[23][19]=1;
		matrica[23][16]=1;
		
		matrica[12][11]=5;
		matrica[18][16]=5;
		matrica[12][20]=5;
		matrica[4][18]=5;
		matrica[5][5]=5;
		matrica[8][10]=5;
		matrica[10][4]=5;
		matrica[1][3]=5;
		matrica[1][23]=5;
		matrica[11][23]=5;
	}
	public int dajVrednost(int i,int j)
	{
		return matrica[i][j];
	}
	public int getNivo()
	{
		return nivo;
	}
	public int odigrajPotez(String s)
	{
		
		int ind=0;
		boolean n = false;
		/*uzima se trenutna pozicija igraca*/
		for(int i=0;i<25;i++)
			for(int j=0;j<25;j++)
				if(matrica[i][j]==2)
				{
					l=i;
					k=j;
				}
		/*ako je pritisnuta desna strelica */
		if(s=="R")
		{
			/*ako je trenutna ispit a desno je ispit ili obicna */
			if(matrica[l][k]==2 && z==5 && (matrica[l][k+1]==0 || matrica[l][k+1]==5))
			{
				matrica[l][k]=broj;	
				broj++;
				n=true;
			}
			
			/*ako je desno od igraca kraj*/
			if(matrica[l][k+1]==4)
			{
				/*ako prosla nije ispit, ako je ispit vec je postavljena u prvom if-u*/
				if(n==false)
					matrica[l][k]=3;/*trenutna se boji u zelenu*/
				matrica[l][k+1]=2;/*desno od igraca se boji u sliku igraca*/
				ind=4;	/* da javi GUI-ju da je kraj*/
			}
			/*ako je desno od igraca ispit  ili obicno polje*/
			else if(matrica[l][k+1]==0 || matrica[l][k+1]==5)
			{
				z=0;
				/*ako je ispit*/
				if(matrica[l][k+1]==5)
				{
					ind=5;	/*da javi GUI-ju da je ispit*/
					z=5;	/*ako je ispit z se postavlja na 5 kao indikator da bi se u sledecem koraku znalo */
				}
				/*trenutna se boji u svetlo zelenu ako nije ispit*/
				if(n==false)
					matrica[l][k]=3;
				
				/*sledeca se boji u sliku igraca*/
				matrica[l][k+1]=2;
				
				
			}	
			/*ako je desno vec zelena*/
			else if(matrica[l][k+1]==3)
			{
				/*trenutna se boji u svetlo plavu ako nije ispit*/
				if(n==false)
					matrica[l][k]=0;
				/*sledeca se boji u igraca*/
				matrica[l][k+1]=2;
			}
			/*ako je desno ispit na kom je vec bio*/
			else if(matrica[l][k+1]>5)
			{
				ind=6;
			}
			else
			{
				ind=1;
			}
			
		}
		else if(s=="L")
		{
			if(matrica[l][k]==2 && z==5 && (matrica[l][k-1]==0 || matrica[l][k-1]==5))
			{
				matrica[l][k]=broj;
				broj++;
				n=true;
			}
			if(matrica[l][k-1]==4)
			{
				if(n==false)
				matrica[l][k]=3;
				matrica[l][k-1]=2;
				ind=4;
			}
			else if(matrica[l][k-1]==0 || matrica[l][k-1]==5)
			{
				z=0;
				if(matrica[l][k-1]==5)
				{
					z=5;
					ind=5;
				}
				if(n==false)
				matrica[l][k]=3;
				matrica[l][k-1]=2;
			}
			else if(matrica[l][k-1]==3)
			{
			
				if(n==false)
				matrica[l][k]=0;
				matrica[l][k-1]=2;
			}
			else if(matrica[l][k-1]>5)
			{
				ind=6;
			}
			else
			{
				ind=1;
			}
		}
		else if(s=="U")
		{
			if(matrica[l][k]==2 && z==5 && (matrica[l-1][k]==0 || matrica[l-1][k]==5))
			{
				matrica[l][k]=broj;
				broj++;
				n=true;
			}
			if(matrica[l-1][k]==4)
			{
				ind=4;
				if(n==false)
				matrica[l][k]=3;
				matrica[l-1][k]=2;
			}
			else if(matrica[l-1][k]==0 || matrica[l-1][k]==5)		
			{	
				z=0;
				if(matrica[l-1][k]==5)
				{
					z=5;
					ind=5;
				}
				if(n==false)
				matrica[l][k]=3;
				matrica[l-1][k]=2;
			}
			else if(matrica[l-1][k]==3)
			{
				if(n==false)
				matrica[l][k]=0;
				matrica[l-1][k]=2;
			}
			else if(matrica[l-1][k]>5)
			{
				ind=6;
			}
			else
			{
				ind=1;
			}
		}
		else if(s=="D")
		{
			if(matrica[l][k]==2 && z==5 && (matrica[l+1][k]==0 || matrica[l+1][k]==5))
			{
				matrica[l][k]=broj;
				broj++;
				n=true;
			}
			if(matrica[l+1][k]==4)
			{
				if(n==false)
				matrica[l][k]=3;
				matrica[l+1][k]=2;
				ind=4;
			}
			else if(matrica[l+1][k]==0 || matrica[l+1][k]==5)
			{
				z=0;
				if(matrica[l+1][k]==5)
				{
					ind=5;
					z=5;
				}
				if(n==false)
				matrica[l][k]=3;
				matrica[l+1][k]=2;
			}
			else if(matrica[l+1][k]==3)
			{
				if(n==false)
				matrica[l][k]=0;
				matrica[l+1][k]=2;
			}
			else if(matrica[l+1][k]>5)
			{
				ind=6;
			}
			else
			{
				ind=1;
			}
		}
		return ind;	
	}
	public String dajNazivIspita()
	{
		if(broj==6)
			return "Teorijske osnove informatike 1";
		else if(broj==7)
			return "Matematiku 1";
		else if(broj==8)
			return "Racunarske sisteme";
		else if(broj==9)
			return "Engleski jezik B1";
		else if(broj==10)
			return "Osnove programiranja";
		else if(broj==11)
			return "Softverse alate 1";
		else if(broj==12)
			return "Arhitekturu racunara 1";
		else if(broj==13)
			return "Matematiku 2";
		else if(broj==14)
			return "Teorijske osnove informatike 2";
		else if(broj==15)
			return "Strukture podataka i algoritme 1";
		else if(broj==16)
			return "Operativne sisteme 1";
		else if(broj==17)
			return "Matematiku 3";
		else if(broj==18)
			return "Baze podataka 1";
		else if(broj==19)
			return "Softverske alate 2";
		else if(broj==20)
			return "Strukture podataka i algoritme 2";
		else if(broj==21)
			return "Engleski jezik B2";
		else if(broj==22)
			return "Racunarske mreze i mrezne tehnologije";
		else if(broj==23)
			return "Klijentske web tehnologije";
		else if(broj==24)
			return "Osnove ekologije";
		else if(broj==25)
			return "Objektno orjentisano programiranje";
		else if(broj==26)
			return "Algoritamske strategije";
		else if(broj==27)
			return "Vizuelno programiranje";
		else if(broj==28)
			return "Web programiranje";
		else if(broj==29)
			return "Informacione sisteme 1";
		else if(broj==30)
			return "Numericku matematiku i simbolicko programiranje";
		else if(broj==31)
			return "Softverski inzenjering";
		else if(broj==32)
			return "Elektronsko poslovanje";
		else if(broj==33)
			return "Inteligentne sisteme";
		else if(broj==34)
			return "Baze podataka 2";
		else if(broj==35)
			return "Formalne jezike, automate i jezicke procesore";
		else if(broj==36)
			return "Finansijsku matematiku";
		else if(broj==37)
			return "Operativne sisteme 2";
		else if(broj==38)
			return "Informacione sisteme 2";
		else if(broj==39)
			return "Paralelno programiranje";
		else if(broj==40)
			return "Programiranje slozenih softverskih sistema";
		else if(broj==41)
			return "Racunarsku grafiku";
		else if(broj==42)
			return "Projektni zadatak";
		else 
			return "Zavrsni rad";
	}
}
