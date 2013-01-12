function createTenant() { 
var myData = [
        ['SU01',6.1,'Online',5],
        ['SU02',6.0,'Online',2],
        ['SU03',7.0,'Online',2],
        ['SU04',6.0,'Online',1]
    ];
	
	    // create the data store
    var store = Ext.create('Ext.data.ArrayStore', {
        fields: [
           {name: 'name'},
           {name: 'version', type: 'float'},
           {name: 'status'},
           {name: 'number_of_tenants',type:'float'}		 
        ],
        data: myData
    });

   var grid =  Ext.create('Ext.grid.Panel', {
       store: store,
    //   id: 'ten-panel',
       columns: [{
           header: 'Name',
           dataIndex: 'name',
			width: 100,
			align:'center'
       }, {
           header: 'Version',
           dataIndex: 'version',
           width: 100,
           align : 'left',
           sortable:false

       }, {
           header: 'Status',
           dataIndex: 'status',             
           width: 100,
           sortable:false
       },{
		   header: 'Number of Tenants', 
		   dataIndex:'number_of_tenants',
           width:100, 
           sortable :false,           
        }],
       renderTo: 'editor-grid',
       width: 600,
       height: 400,

   });
   
	
    
    return {
    	
        window :  Ext.create('Ext.window.Window', {
            title: 'Resize Me',
            width: 500,
            height: 300,
            minWidth: 300,
            minHeight: 200,
            layout: 'fit',
            plain:true,
            items: grid,
            buttons: [{
                text: 'Cancel'
            },{
                text: '< Back'
            },{
                text: 'Next >'
            }]
        })
    }
        win.show();
    
}