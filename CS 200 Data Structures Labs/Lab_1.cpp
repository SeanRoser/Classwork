//Roser, Sean

//Part 1
   map <string, set<string>> connections{
      {"AEY", {"EGS RKV"}},
      {"BIU", {"IFJ RKV"}},
      {"EGS", {"AEY HFN"}},
      {"GJR", {"GRY IFJ RKV"}},
      {"GRY", {"GJR THO"}},
      {"HFN", {"EGS RKV"}},
      {"HZK", {"THO"}},
      {"IFJ", {"BIU GJR RKV"}},
      {"KEF", {"RKV VEY"}},
      {"RKV", {"AEY BIU GJR HFN IFJ KEF THO VEY VPN"}},
      {"THO", {"GRY HZK RKV"}},
      {"VEY", {"KEF RKV"}},
      {"VPN", {"RKV"}}
   };

//Part 2
   void printConnections(const map<string, set<string>>& airportConnections)
   {
      for(const auto& airports : airportConnections)
      {
         cout << airports.first << " => ";
         for(const auto& connections : airports.second)
         {
            cout << connections << " ";
         }
         cout << endl;
      }
   }

//Part 3
   vector<vector<int>> connections = {
       {0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, //AEY
       {0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0}, //BIU
       {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0}, //EGS
       {0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0}, //GJR
       {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0}, //GRY
       {0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, //HFN
       {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, //HZK
       {0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, //IFJ
       {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0}, //KEF
       {1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1}, //RKV
       {0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0}, //THO
       {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0}, //VEY
       {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, //VPN
    };

//Part 4
   bool areConnected(const vector<string>& airports, const vector<vector<int>>& connections, const string& airportOne, const string& airportTwo)
   {
      int posOne = 0;
      int posTwo = 0;
      
      while (airports[posOne] != airportOne)
      {
         posOne++;
      }
      
      while (airports[posTwo] != airportTwo)
      {
         posTwo++;
      }

      return (connections[posOne][posTwo] == 1);
   }