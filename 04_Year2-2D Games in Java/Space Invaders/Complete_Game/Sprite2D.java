����   ? :
      java/lang/Object <init> ()V	  	 
   %Space_Invaders/Complete_Game/Sprite2D framesDrawn I	     myImage Ljava/awt/Image;	     myImage2	     x D	     y
       java/awt/Graphics 	drawImage 3(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z	  " #  winWidth #(Ljava/awt/Image;Ljava/awt/Image;)V Code LineNumberTable LocalVariableTable this 'LSpace_Invaders/Complete_Game/Sprite2D; i i2 setPosition (DD)V xx yy paint (Ljava/awt/Graphics;)V g Ljava/awt/Graphics; StackMapTable setWinWidth (I)V w 
SourceFile Sprite2D.java !                                #       $  %   b     *� *� *+� *,� �    &          	      '         ( )      *      +    , -  %   Q     *'� *)� �    &          
  '         ( )      .      /    0 1  %   �     B*Y� `� *� dp2� +*� *� �*� �� W� +*� *� �*� �� W�    &        
    -  A  '       B ( )     B 2 3  4    - 	 5 6  %   3     � !�    &   
       '        7     8    9