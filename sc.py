import pandas as pd 
df = pd.read_csv('frechchange.csv')
print(len(df.keys()))
for i in range(len(df.keys())):
    df1 = df.iloc[:,[0,i]]
    name = df1.keys()[1]
    df1.columns = ["key", "value"];
    df1.to_csv(str(name)+'.csv', index=False)